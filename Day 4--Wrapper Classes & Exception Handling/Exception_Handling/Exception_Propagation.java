public class Exception_Propagation {
    
    // Exception propagation is the process by which an exception is passed up the call stack until it is caught and handled by an appropriate catch block. 
    // If an exception is not caught in the current method, it will propagate to the caller method, and this process continues until the exception is caught or reaches the top of the call stack.

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }
    }

    public static void methodA() throws Exception {
        methodB();
    }

    public static void methodB() throws Exception {
        throw new Exception("An error occurred in methodB!");
    }
    
}
