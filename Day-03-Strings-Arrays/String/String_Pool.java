public class String_Pool {
    public static void main(String[] args) {
        // String pool is a special memory area where string literals are stored.
        // When we create a string using a string literal, it is stored in the string pool.
        // If another string with the same content is created using a literal, it will reference the same object in the pool.
        // This is an optimization technique to save memory and improve performance.

        String str1 = "Hello";
        String str2 = "Hello";
        
        // Both str1 and str2 reference the same object in the string pool
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str1 == str2: " + (str1 == str2)); // true
        
        // However, if we create a string using the new keyword, it will create a new object in memory
        String str3 = new String("Hello");
        
        System.out.println("str3: " + str3);
        System.out.println("str1 == str3: " + (str1 == str3)); // false
    }

    
}
