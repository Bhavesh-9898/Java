public class throw_Keyword {
    
    // The throw keyword in Java is used to explicitly throw an exception from a method or a block of code. 
    // It is typically used to signal that an error condition has occurred and that the normal flow of execution should be interrupted. 
    // When an exception is thrown using the throw keyword, it must be caught and handled by a try-catch block or declared in the method signature using the throws keyword.

    public static void main(String[] args) {
        try {
            throw new Exception("This is a custom exception message."); // Throwing a new exception
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
    
}
