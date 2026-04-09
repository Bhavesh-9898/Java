public class Array_Limitations {
    // This class demonstrates the limitations of arrays in Java.

    public static void main(String[] args) {
        // Limitation 1: Fixed size
        int[] fixedArray = new int[5];
        // Once created, the size of the array cannot be changed
        // fixedArray = new int[10]; // This will create a new array, not resize the existing one

        // Limitation 2: Homogeneous data type
        String[] stringArray = new String[3];
        // stringArray[0] = 123; // This will cause a compile-time error because it's not a String

        // Limitation 3: No built-in methods for common operations
        int[] numbers = {1, 2, 3, 4, 5};
        // There are no built-in methods to easily add or remove elements from the array
        // We would need to create a new array and copy elements manually to achieve this
    }

    
}
