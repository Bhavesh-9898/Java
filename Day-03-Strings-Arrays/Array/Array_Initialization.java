public class Array_Initialization {

    // This class demonstrates different methods of initializing arrays in Java.

    public static void main(String[] args) {
        // Method 1: Using array literal
        int[] numbers = {1, 2, 3, 4, 5};

        // Method 2: Using new keyword
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        // Method 3: Using Arrays.fill() method
        double[] prices = new double[5];
        java.util.Arrays.fill(prices, 9.99);

        // Print the arrays
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers));
        System.out.println("Names: " + java.util.Arrays.toString(names));
        System.out.println("Prices: " + java.util.Arrays.toString(prices));
    }
}