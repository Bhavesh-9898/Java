public class Null_Handling {
    
    // When working with wrapper classes, it's important to handle null values properly to avoid NullPointerExceptions. Since wrapper classes are objects, they can be assigned null, which can lead to issues when trying to perform operations on them.
    // Example of null handling with wrapper classes:

    public static void main(String[] args) {
        Integer a = null; // Assigning null to an Integer object
        try {
            int b = a; // This will throw a NullPointerException due to unboxing a null value
            System.out.println("Unboxed value: " + b);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        
        // To avoid this, always check for null before performing operations on wrapper objects
        Integer d = null;
        if (d != null){
            int c = d; // Safe unboxing
            System.out.println("Unboxed value: " + c);
        }
        else {
            System.out.println("The Integer object is null, cannot unbox.");
        }
    }
    
}
