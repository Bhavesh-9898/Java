public class Final_Variables {
    // Final variables are declared using the 'final' keyword. Once a final variable is assigned a value, it cannot be changed. Final variables must be initialized at the time of declaration or within a constructor if they are instance variables.
    public static void main(String[] args) {
        final int MAX_VALUE = 100; // This is a final variable
        System.out.println("The maximum value is: " + MAX_VALUE);
        
        // Uncommenting the following line will cause a compilation error because MAX_VALUE cannot be reassigned
        // MAX_VALUE = 200; 
    }
}