public class String_Comparison {

    // String comparison in Java can be done using '==' operator and 'equals()' method.
    // '==' operator checks if both references point to the same object in memory.
    // 'equals()' method checks if the content of the strings is the same.
    // It's important to understand the difference between these two when comparing strings.
    // In Java, string literals are interned, meaning they are stored in a common pool.
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        // Using '==' operator (compares references)
        System.out.println("Using '==':");
        System.out.println("str1 == str2: " + (str1 == str2)); // true, because of string pool
        System.out.println("str1 == str3: " + (str1 == str3)); // false, different objects
        
        // Using 'equals()' method (compares content)
        System.out.println("\nUsing 'equals()':");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
    }
    
}
