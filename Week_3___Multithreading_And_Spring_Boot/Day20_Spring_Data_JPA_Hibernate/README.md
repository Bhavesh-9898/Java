# Day 20 — Spring Data JPA & Hibernate

📅 **Date:** April 26, 2026  
📚 **Topics:** ORM, JPA Annotations, Repositories, Lazy vs Eager, N+1 Problem  

---

## 📖 Notes

### 1. ORM Concept

```
Java Object  ←→  Database Table
─────────────────────────────────
User.class   ←→  users table
user.name    ←→  name column
user.id      ←→  id column (PK)
```

- **JPA** = Specification (interface)
- **Hibernate** = Implementation (most popular)

### 2. Entity Annotations

```java
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Column(unique = true)
    private String isbn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private Author author;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // Getters, Setters, Constructors
}
```

### 3. Relationship Annotations

| Annotation | Relationship | Example |
|-----------|-------------|---------|
| `@OneToOne` | 1:1 | User ↔ Profile |
| `@OneToMany` | 1:N | Author → Books |
| `@ManyToOne` | N:1 | Book → Author |
| `@ManyToMany` | M:N | Student ↔ Course |

### 4. Repositories

```java
// CrudRepository — basic CRUD
// JpaRepository — CRUD + pagination + sorting + batch

public interface BookRepository extends JpaRepository<Book, Long> {

    // Derived query methods (auto-generated SQL!)
    List<Book> findByTitle(String title);
    List<Book> findByAuthorNameContaining(String name);
    List<Book> findByPriceLessThan(double price);
    Optional<Book> findByIsbn(String isbn);
    boolean existsByIsbn(String isbn);
    long countByAuthorId(Long authorId);

    // Custom JPQL query
    @Query("SELECT b FROM Book b WHERE b.price > :price ORDER BY b.title")
    List<Book> findExpensiveBooks(@Param("price") double price);

    // Native SQL query
    @Query(value = "SELECT * FROM books WHERE title LIKE %:keyword%", nativeQuery = true)
    List<Book> searchByKeyword(@Param("keyword") String keyword);
}
```

### 5. Lazy vs Eager Loading

| Feature | Lazy | Eager |
|---------|------|-------|
| When loaded | On first access | Immediately with parent |
| Default | `@OneToMany`, `@ManyToMany` | `@ManyToOne`, `@OneToOne` |
| Performance | Better (load when needed) | Risk of loading too much |
| Exception | `LazyInitializationException` (outside transaction) | N/A |

### 6. N+1 Problem

```
Problem:
  1 query for Authors → N queries for Books (one per author)

Solutions:
  1. JOIN FETCH (JPQL):
     @Query("SELECT a FROM Author a JOIN FETCH a.books")
     
  2. @EntityGraph:
     @EntityGraph(attributePaths = {"books"})
     List<Author> findAll();
     
  3. @BatchSize(size = 10) on the collection
  
  4. Use DTOs (project only needed fields)
```

---

## 🔑 Key Interview Questions

1. **JPA vs Hibernate?** — JPA is spec, Hibernate implements it
2. **CrudRepository vs JpaRepository?** — JpaRepository extends CrudRepository + adds pagination/batch
3. **What is N+1 problem?** — Loading parent triggers N additional queries for children
4. **Lazy vs Eager default?** — @ManyToOne/@OneToOne = Eager; @OneToMany/@ManyToMany = Lazy
5. **What is dirty checking?** — Hibernate auto-detects entity changes and updates DB on flush

---

## ✅ Practice Exercises

1. Create `Author` and `Book` entities with `@OneToMany`
2. Write derived query methods in repository
3. Solve N+1 with `JOIN FETCH`
