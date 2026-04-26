import java.util.*;
import java.util.stream.*;

/**
 * Day 20 — Fun Example: Library Management System 📚 (JPA/Hibernate Concepts)
 * 
 * Simulates JPA entity relationships and repository queries using plain Java.
 * No Spring needed — just understanding how ORM works!
 * 
 * Demonstrates: @Entity, @OneToMany, @ManyToOne, Repository pattern,
 *               Derived queries, N+1 problem, JOIN FETCH concept
 */
public class LibrarySystem {

    // Simulated "Database" (HashMap = table)
    static Map<Integer, Author> authorTable = new LinkedHashMap<>();
    static Map<Integer, Book> bookTable = new LinkedHashMap<>();
    static int authorIdSeq = 1;
    static int bookIdSeq = 1;

    public static void main(String[] args) {
        System.out.println("=== 📚 Library Management System (JPA Concepts) ===\n");

        // --- Create Entities (like JPA @Entity) ---
        System.out.println("--- Creating Entities (INSERT) ---\n");
        
        Author author1 = saveAuthor("J.K. Rowling", "UK");
        Author author2 = saveAuthor("George Orwell", "UK");
        Author author3 = saveAuthor("Chetan Bhagat", "India");

        saveBook("Harry Potter and the Philosopher's Stone", 1997, 599, author1);
        saveBook("Harry Potter and the Chamber of Secrets", 1998, 499, author1);
        saveBook("Harry Potter and the Prisoner of Azkaban", 1999, 549, author1);
        saveBook("1984", 1949, 350, author2);
        saveBook("Animal Farm", 1945, 299, author2);
        saveBook("Five Point Someone", 2004, 199, author3);
        saveBook("2 States", 2009, 249, author3);

        // --- Repository-style Queries ---
        System.out.println("\n--- 🔍 Repository Queries ---\n");

        // findAll()
        System.out.println("📋 findAll() — All books:");
        bookTable.values().forEach(b -> 
            System.out.printf("  [%d] %-45s | %d | ₹%d | by %s%n", 
                b.id, b.title, b.year, b.price, b.author.name));

        // findById()
        System.out.println("\n🔍 findById(1):");
        Optional<Book> found = Optional.ofNullable(bookTable.get(1));
        found.ifPresentOrElse(
            b -> System.out.println("  Found: " + b.title + " by " + b.author.name),
            () -> System.out.println("  Not found!")
        );

        // findByAuthorName() — Derived query
        System.out.println("\n🔍 findByAuthorName('J.K. Rowling'):");
        findByAuthorName("J.K. Rowling").forEach(b -> 
            System.out.println("  → " + b.title + " (" + b.year + ")"));

        // findByPriceLessThan() — Derived query
        System.out.println("\n🔍 findByPriceLessThan(300):");
        findByPriceLessThan(300).forEach(b -> 
            System.out.println("  → " + b.title + " — ₹" + b.price));

        // findByYearBetween() — Derived query
        System.out.println("\n🔍 findByYearBetween(1940, 1950):");
        findByYearBetween(1940, 1950).forEach(b -> 
            System.out.println("  → " + b.title + " (" + b.year + ")"));

        // countByAuthor() — Aggregation
        System.out.println("\n📊 countByAuthor():");
        authorTable.values().forEach(a -> {
            long count = bookTable.values().stream().filter(b -> b.author.id == a.id).count();
            System.out.println("  " + a.name + ": " + count + " books");
        });

        // --- N+1 Problem Demo ---
        System.out.println("\n\n=== ⚠️ N+1 Problem Demo ===\n");

        System.out.println("❌ BAD: Loading all authors, then books for each (N+1 queries):");
        System.out.println("  Query 1: SELECT * FROM authors                    (1 query)");
        int queryCount = 1;
        for (Author a : authorTable.values()) {
            queryCount++;
            System.out.println("  Query " + queryCount + ": SELECT * FROM books WHERE author_id = " + a.id 
                             + "  (for " + a.name + ")");
        }
        System.out.println("  Total: " + queryCount + " queries! (1 + " + authorTable.size() + " = N+1 problem)\n");

        System.out.println("✅ GOOD: Using JOIN FETCH (1 query):");
        System.out.println("  Query 1: SELECT a.*, b.* FROM authors a");
        System.out.println("           JOIN books b ON a.id = b.author_id");
        System.out.println("  Total: 1 query! 🎉");

        // Simulate JOIN FETCH result
        System.out.println("\n📋 JOIN FETCH Result:");
        authorTable.values().forEach(a -> {
            List<Book> books = bookTable.values().stream()
                .filter(b -> b.author.id == a.id)
                .collect(Collectors.toList());
            System.out.println("  👤 " + a.name + " (" + a.country + "):");
            books.forEach(b -> System.out.println("     📖 " + b.title + " (" + b.year + ")"));
        });

        // --- Relationship Types ---
        System.out.println("\n\n--- 📊 JPA Relationship Types ---");
        System.out.println("┌──────────────┬───────────────────────────────────────┐");
        System.out.println("│ Annotation   │ Example                               │");
        System.out.println("├──────────────┼───────────────────────────────────────┤");
        System.out.println("│ @OneToOne    │ User ←→ Profile                      │");
        System.out.println("│ @OneToMany   │ Author → List<Book>                  │");
        System.out.println("│ @ManyToOne   │ Book → Author                        │");
        System.out.println("│ @ManyToMany  │ Student ←→ Course                    │");
        System.out.println("└──────────────┴───────────────────────────────────────┘");
    }

    // --- Simulated JPA Repository Methods ---

    static Author saveAuthor(String name, String country) {
        Author a = new Author(authorIdSeq++, name, country);
        authorTable.put(a.id, a);
        System.out.println("  💾 Saved Author: " + a.name + " (id=" + a.id + ")");
        return a;
    }

    static Book saveBook(String title, int year, int price, Author author) {
        Book b = new Book(bookIdSeq++, title, year, price, author);
        bookTable.put(b.id, b);
        System.out.println("  💾 Saved Book: " + b.title + " (id=" + b.id + ")");
        return b;
    }

    static List<Book> findByAuthorName(String name) {
        return bookTable.values().stream()
            .filter(b -> b.author.name.equals(name))
            .collect(Collectors.toList());
    }

    static List<Book> findByPriceLessThan(int price) {
        return bookTable.values().stream()
            .filter(b -> b.price < price)
            .collect(Collectors.toList());
    }

    static List<Book> findByYearBetween(int start, int end) {
        return bookTable.values().stream()
            .filter(b -> b.year >= start && b.year <= end)
            .collect(Collectors.toList());
    }
}

// --- Entity: Author (like @Entity + @OneToMany) ---
class Author {
    int id;           // @Id @GeneratedValue
    String name;      // @Column
    String country;   // @Column

    Author(int id, String name, String country) {
        this.id = id; this.name = name; this.country = country;
    }
}

// --- Entity: Book (like @Entity + @ManyToOne) ---
class Book {
    int id;           // @Id @GeneratedValue
    String title;     // @Column
    int year;         // @Column
    int price;        // @Column
    Author author;    // @ManyToOne @JoinColumn(name = "author_id")

    Book(int id, String title, int year, int price, Author author) {
        this.id = id; this.title = title; this.year = year;
        this.price = price; this.author = author;
    }
}
