public class length_Property {
    // This program demonstrates the use of the length property of arrays in Java.
    // The length property of an array returns the number of elements in the array.
    // It is important to note that the length property is not a method, so it does not require parentheses when accessed.
    // The length property is useful for iterating through arrays and performing operations based on the size of the array.
    // In this example, we will create two arrays and use the length property to display their sizes and iterate through their elements.

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};
        
        // Using the length property to get the size of the arrays
        System.out.println("Length of numbers array: " + numbers.length); // Output: 5
        System.out.println("Length of names array: " + names.length); // Output: 3
        
        // The length property is useful for iterating through arrays
        System.out.println("Iterating through numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nIterating through names array:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
    
}
