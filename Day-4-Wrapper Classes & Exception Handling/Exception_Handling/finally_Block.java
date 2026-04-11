public class finally_Block {
    
    // The finally block is a block of code that is always executed after the try block, regardless of whether an exception was thrown or caught. 
    // It is typically used for cleanup operations, such as closing resources or releasing locks, to ensure that they are executed even if an exception occurs.

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This will always be executed, regardless of exceptions.");
        }
    }
    
}
