public class Unchecked_Exceptions {
    
    // Unchecked exceptions are exceptions that are not checked at compile-time. 
    // They are subclasses of RuntimeException and do not need to be declared in the method signature or caught using a try-catch block. 
    // Examples of unchecked exceptions include NullPointerException, ArrayIndexOutOfBoundsException, and IllegalArgumentException.
    // Example of handling an unchecked exception:

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    
}
