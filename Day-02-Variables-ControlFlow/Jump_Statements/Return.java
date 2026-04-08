public class Return {
    public static void main(String[] args) {
        // The return statement is used to exit a method and optionally return a value. 
        // When a return statement is encountered inside a method, the method is immediately terminated, and the program continues with the next statement after the method call.

        // Using return in a method
        int result = add(5, 10);
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b; // Return the sum of a and b
    }
}
