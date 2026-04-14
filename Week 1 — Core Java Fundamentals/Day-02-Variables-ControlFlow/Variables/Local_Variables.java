public class Local_Variables {
    // Local variables are declared within a method, constructor, or block. They are only accessible within the scope of that method, constructor, or block. Local variables must be initialized before they can be used.
    public static void main(String[] args) {
        int localVariable = 10; // This is a local variable
        System.out.println("The value of the local variable is: " + localVariable);
        
        // Uncommenting the following line will cause a compilation error because localVariable is not accessible outside the main method
        // System.out.println(localVariable); 
    }
}