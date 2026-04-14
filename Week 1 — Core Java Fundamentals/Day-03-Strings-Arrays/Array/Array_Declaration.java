public class Array_Declaration {
    // This program demonstrates different ways to declare and initialize arrays.
    // In Java, arrays are objects that store multiple values of the same type.
    // We can declare and initialize arrays in several ways, as shown below.
    // Method 1: Declare and initialize an array in one line
    // Method 2: Declare an array and then initialize it
    // Method 3: Using a loop to initialize an array
    // Note: The size of an array must be specified at the time of declaration, and it cannot be changed later.
    
    public static void main(String[] args) {
        // Method 1: Declare and initialize an array in one line
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Method 2: Declare an array and then initialize it
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";
        
        // Method 3: Using a loop to initialize an array
        double[] prices = new double[5];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = (i + 1) * 10.0; // Assigning values like 10.0, 20.0, etc.
        }
        
        // Print the arrays to verify their contents
        System.out.println("Numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nFruits: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println("\nPrices: ");
        for (double price : prices) {
            System.out.print(price + " ");
        }
    }
    
}
