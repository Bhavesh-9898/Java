public class throws_Keyword {
    
    // The throws keyword in Java is used in a method signature to declare that a method may throw one or more exceptions. 
    // It indicates that the method may encounter certain exceptions during its execution, and it allows the caller of the method to handle those exceptions appropriately. 
    // When a method declares that it throws an exception, any code that calls that method must either catch the exception using a try-catch block or declare that it also throws the exception.

    public static void main(String[] args) {
        try {
            riskyMethod(); // Calling a method that may throw an exception
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void riskyMethod() throws Exception {
        throw new Exception("This is a custom exception message."); // Throwing a new exception
    }
    
}
