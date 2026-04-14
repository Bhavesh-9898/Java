public class Multiple_Catch_Blocks {
    
    // Multiple catch blocks allow you to handle different types of exceptions separately. 
    // Each catch block can specify a different exception type, and the appropriate block will be executed based on the type of exception thrown.

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
    
}
