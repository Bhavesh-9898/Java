public class Constructor_Chaining {
    // Constructor chaining is a technique in Java where one constructor calls another constructor in the same class or in the parent class. 
    // It is used to avoid code duplication and to improve code readability. 
    // Constructor chaining can be achieved using the this() keyword to call another constructor in the same class, or using the super() keyword to call a constructor in the parent class.

    Constructor_Chaining() {
        this(10); // calling parameterized constructor
        System.out.println("This is a default constructor");
    }

    Constructor_Chaining(int x) {
        System.out.println("This is a parameterized constructor with value: " + x);
    }
    
}
