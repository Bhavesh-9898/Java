public class Checked_Exceptions {

    // Checked exceptions are exceptions that are checked at compile-time. 
    // They must be either caught using a try-catch block or declared in the method signature using the throws keyword. 
    // Examples of checked exceptions include IOException, SQLException, and ClassNotFoundException.
    // Example of handling a checked exception:

    public static void main(String[] args) {
        try {
            // Attempting to read a file that may not exist
            java.io.FileReader file = new java.io.FileReader("nonexistentfile.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }
    
}
