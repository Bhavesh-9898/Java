public class Constructor_Chaining {

    // This class demonstrates constructor chaining in Java, where one constructor calls another constructor in the same class using the 'this' keyword.
    // Constructor chaining helps to avoid code duplication and allows for better organization of constructor logic. 
    // In this example, the no-argument constructor calls the parameterized constructor with a default value of 10.
    // Constructor chaining example

    public Constructor_Chaining() {
        this(10); // Calls the parameterized constructor with an int argument
        System.out.println("No-argument constructor called");
    }
    
    public Constructor_Chaining(int value) {
        System.out.println("Parameterized constructor called with value: " + value);
    }
}
