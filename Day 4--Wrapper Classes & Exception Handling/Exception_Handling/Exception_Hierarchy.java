public class Exception_Hierarchy {
    
    // In Java, exceptions are organized in a hierarchical structure. At the top of the hierarchy is the Throwable class, which has two main subclasses: Exception and Error. 
    // The Exception class is further divided into checked exceptions (which must be handled or declared) and unchecked exceptions (which do not require handling). 
    // Understanding this hierarchy is crucial for effective exception handling in Java.

    public static void main(String[] args) {
        // Example of catching a checked exception
        try {
            java.io.FileReader file = new java.io.FileReader("nonexistentfile.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }

        // Example of catching an unchecked exception
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    
}
