public class String_Declaration {
    public static void main(String[] args) {
        // String declaration using string literal
        // When we create a string using a string literal, it is stored in the string pool.
        // If another string with the same content is created using a literal, it will reference the same object in the pool.
        // String literals are immutable, meaning their content cannot be changed after they are created.
        String str1 = "Hello, World!";
        
        // String declaration using new keyword
        String str2 = new String("Hello, World!");
        
        System.out.println(str1); // Output: Hello, World!
        System.out.println(str2); // Output: Hello, World!
    }
    
}
