public class String_Creation {
    public static void main(String[] args) {
        // String creation using string literal
        // When we create a string using a string literal, it is stored in the string pool.
        // If another string with the same content is created using a literal, it will reference the same object in the pool.
        String str1 = "Hello";
        
        // String creation using new keyword
        String str2 = new String("Hello");
        
        System.out.println("String created using literal: " + str1);
        System.out.println("String created using new keyword: " + str2);
    }
    
}
