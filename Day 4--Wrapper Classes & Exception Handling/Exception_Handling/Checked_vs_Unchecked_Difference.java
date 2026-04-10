public class Checked_vs_Unchecked_Difference {
    
    // Checked exceptions are exceptions that are checked at compile-time. They must be either caught or declared in the method signature using the throws keyword. Examples of checked exceptions include IOException and SQLException.

    // Unchecked exceptions, on the other hand, are exceptions that are not checked at compile-time. They do not need to be declared or caught. Examples of unchecked exceptions include NullPointerException and ArrayIndexOutOfBoundsException.

    public static void main(String[] args) {
        // Example of a checked exception
        try {
            throw new Exception("This is a checked exception!");
        } catch (Exception e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // Example of an unchecked exception
        String str = null;
        try {
            System.out.println(str.length()); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
    
}
