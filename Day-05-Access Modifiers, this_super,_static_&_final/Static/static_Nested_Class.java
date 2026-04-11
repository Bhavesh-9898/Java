public class static_Nested_Class {
    // A static nested class is a nested class that is declared static. 
    // It can be accessed without creating an instance of the outer class.  
    // A static nested class can access only static members of the outer class, and it cannot access instance members of the outer class directly. 
    // A static nested class is useful when you want to group classes that are only used in 
    // one place and to increase encapsulation.
    // A static nested class can be instantiated without an instance of the outer class, but it cannot access instance variables or instance methods of the outer class directly

    static class Nested {
        void display() {
            System.out.println("This is a static nested class");
        }
    }
    
}
