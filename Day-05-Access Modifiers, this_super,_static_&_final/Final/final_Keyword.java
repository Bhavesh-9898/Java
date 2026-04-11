public class final_Keyword {
    // The final keyword in Java is used to declare constants, prevent method overriding, and prevent inheritance. 
    // When a variable is declared as final, its value cannot be changed once it has been assigned. 
    // When a method is declared as final, it cannot be overridden by any subclass. 
    // When a class is declared as final, it cannot be subclassed or extended by any other class.
    // The final keyword can be used with variables, methods, and classes.

    public static void main(String[] args) {
        final int MAX_VALUE = 100; // This is a final variable, its value cannot be changed.
        System.out.println("The maximum value is: " + MAX_VALUE);
    }
        // The following code will cause a compilation error because we cannot change the value of a final variable.
        // MAX_VALUE = 200; // This will cause a compilation error because we cannot change the value of a final variable.  
}
