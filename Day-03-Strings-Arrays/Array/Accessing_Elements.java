public class Accessing_Elements {

    // This program demonstrates how to access and modify elements in an array.
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements using index
        System.out.println("First element: " + numbers[0]); // Output: 10
        System.out.println("Third element: " + numbers[2]); // Output: 30
        System.out.println("Last element: " + numbers[4]); // Output: 50

        // Modifying an element
        numbers[1] = 25; // Changing the second element from 20 to 25
        System.out.println("Modified second element: " + numbers[1]); // Output: 25
    }
    
}
