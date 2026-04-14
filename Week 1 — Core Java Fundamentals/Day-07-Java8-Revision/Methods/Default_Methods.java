interface MyInterface {
    void abstractMethod();
    
    default void defaultMethod() {
        System.out.println("Default method implementation");
    }
}

public class Default_Methods {

    public static void main(String[] args) {
        // Default methods are methods that have a default implementation in an interface.
        // They can be overridden by the implementing class, but they are not required to be overridden.
        // Default methods are introduced in Java 8 to provide backward compatibility to existing interfaces.

        // Example of a default method in an interface
            MyInterface myInterface = new MyInterface() {
            @Override
            public void abstractMethod() {
                System.out.println("Abstract method implementation");
            }
        };

        myInterface.abstractMethod(); // Output: Abstract method implementation
        myInterface.defaultMethod(); // Output: Default method implementation
    }
    
}
