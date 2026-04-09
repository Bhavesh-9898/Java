public class Multidimensional_Arrays {
    // This class demonstrates the concept of multidimensional arrays in Java.
    // A multidimensional array is an array of arrays. The most common type of multidimensional array is a 2D array, which can be thought of as a table or matrix.
    // In Java, we can declare and initialize multidimensional arrays in various ways, similar to one-dimensional arrays. We can also access and modify elements in a multidimensional array using nested loops or by directly specifying the indices.
    // The following example demonstrates how to declare, initialize, access, and modify elements in a 2D array.

    public static void main(String[] args) {
        // Declaring and initializing a 2D array (array of arrays)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements in a 2D array
        System.out.println("Element at row 1, column 2: " + matrix[0][1]); // Output: 2
        System.out.println("Element at row 3, column 1: " + matrix[2][0]); // Output: 7

        // Modifying an element in a 2D array
        matrix[1][1] = 10; // Changing the element at row 2, column 2 from 5 to 10
        System.out.println("Modified element at row 2, column 2: " + matrix[1][1]); // Output: 10

        // Iterating through a 2D array using nested loops
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
    
}
