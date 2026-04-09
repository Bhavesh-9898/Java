public class String_Initalization {
    // String initialization can be done in several ways in Java. Here are some common methods:
    // 1. Using String Literals: This is the most common way to initialize a string. When you use string literals, they are stored in the string pool, which helps in memory optimization.
    // 2. Using the new Keyword: This creates a new string object in memory, even if the content is the same as an existing string in the pool.
    // 3. Using StringBuilder or StringBuffer: These classes are used for mutable strings   and can be modified after creation without creating new objects.
    // 4. Using char Arrays: You can also initialize a string using a character array, which can be useful for certain operations.

    public static void main(String[] args) {
        // String initialization using string literal
        String str1 = "Hello, World!";
        
        // String initialization using new keyword
        String str2 = new String("Hello, World!");
        
        // String initialization using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        String str3 = sb.toString();
        
        // String initialization using char array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str4 = new String(charArray);
        
        System.out.println(str1); // Output: Hello, World!
        System.out.println(str2); // Output: Hello, World!
        System.out.println(str3); // Output: Hello, World!
        System.out.println(str4); // Output: Hello
    }

    
}
