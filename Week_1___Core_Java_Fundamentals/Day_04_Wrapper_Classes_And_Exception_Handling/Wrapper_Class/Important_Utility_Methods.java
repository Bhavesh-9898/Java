public class Important_Utility_Methods {
    
    // Wrapper classes provide various utility methods for operations like parsing strings into numbers, comparing values, and converting between different types. Some important utility methods include:
    // 1. parseXxx(String s): Converts a string to the corresponding primitive type (e.g., Integer.parseInt("123") returns 123).
    // 2. valueOf(String s): Converts a string to the corresponding wrapper object (e.g., Integer.valueOf("123") returns an Integer object with the value 123).
    // 3. compareTo(T another): Compares the current wrapper object with another object of the same type (e.g., Integer.compareTo(Integer another)).
    // 4. equals(Object obj): Checks if two wrapper objects are equal (e.g., Integer.equals(Object obj)).
    // 5. toString(): Converts a wrapper object to its string representation (e.g., Integer.toString()).
    // Example of using utility methods:

    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str); // Parsing string to int
        Integer numObj = Integer.valueOf(str); // Parsing string to Integer object
        System.out.println("Parsed int: " + num);
        System.out.println("Parsed Integer object: " + numObj);
        
        Integer a = 10;
        Integer b = 20;
        System.out.println("Comparison result: " + a.compareTo(b)); // Comparing two Integer objects
        System.out.println("Are they equal? " + a.equals(b)); // Checking equality
        System.out.println("String representation: " + a.toString()); // Converting to string
    }
    
}
