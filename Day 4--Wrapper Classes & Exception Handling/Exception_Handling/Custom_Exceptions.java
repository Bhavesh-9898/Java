public class Custom_Exceptions {
    
    // Custom exceptions are user-defined exceptions that extend the Exception class. 
    // They allow you to create specific exception types that can provide more meaningful error messages and handling in your application. 
    // Example of a custom exception:

    static class MyCustomException extends Exception {
        public MyCustomException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a custom exception!");
        } catch (MyCustomException e) {
            System.out.println("Caught MyCustomException: " + e.getMessage());
        }
    }
    
}
