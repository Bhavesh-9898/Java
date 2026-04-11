public class try_catch_Block {
    
    // The try-catch block is a fundamental construct in Java for handling exceptions. 
    // The code that may throw an exception is placed inside the try block, and the catch block is used to handle the exception if it occurs. 
    // This allows the program to continue running even if an error occurs, rather than crashing.

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
    
}
