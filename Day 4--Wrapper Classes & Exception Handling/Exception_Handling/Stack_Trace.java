public class Stack_Trace {
    
    // A stack trace is a report of the active stack frames at a certain point in time during the execution of a program. 
    // It is typically used for debugging purposes to understand the sequence of method calls that led to an exception being thrown.

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
            e.printStackTrace(); // This will print the stack trace to the console
        }
    }
    
}
