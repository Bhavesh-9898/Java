public class final_Variable {
    // A final variable is a variable that cannot be changed once it has been assigned a value. 
    // It is declared using the final keyword before the variable name. 
    // A final variable can be initialized at the time of declaration or in a constructor, but it cannot be reassigned after that. 
    // This means that once a final variable has been assigned a value, it cannot be changed, and it cannot be used as a base variable for any other variable.
    // A final variable is useful when you want to create a constant value that cannot be modified by other classes.
    // A final variable can be accessed, but it cannot be modified.

    public static void main(String[] args) {
        final int MAX_VALUE = 100;
        System.out.println("The maximum value is: " + MAX_VALUE);
        // MAX_VALUE = 200; // This will cause a compile-time error because MAX_VALUE is a final variable
    }
    
}
