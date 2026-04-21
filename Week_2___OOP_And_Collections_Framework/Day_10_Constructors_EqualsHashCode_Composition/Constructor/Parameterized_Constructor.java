public class Parameterized_Constructor {
    
    // A parameterized constructor is a constructor that takes parameters (arguments) to initialize an object with specific values at the time of creation.
    // It allows you to create objects with different initial states by passing different arguments to the constructor.
    // If you define a parameterized constructor, the default no-argument constructor will not be provided automatically, and you will need to define it explicitly if you want to use it.

    // Example of a parameterized constructor
    public Parameterized_Constructor(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
