public class This {
    // The this keyword in Java is a reference variable that refers to the current object. 
    // It is used to refer to the current instance of a class and can be used to access the members (variables and methods) of the current object. 
    // The this keyword is commonly used in the following scenarios:
    // 1. To refer to the current instance of a class when there is a naming conflict between instance variables and local variables.
    // 2. To call another constructor from a constructor within the same class (constructor chaining).
    // 3. To pass the current object as an argument to another method or constructor.

    int x;

    This(int x) {
        this.x = x; // Using 'this' to refer to the instance variable 'x'
    }
    
}
