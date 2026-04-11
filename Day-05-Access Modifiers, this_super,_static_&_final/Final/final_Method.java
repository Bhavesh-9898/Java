public class final_Method {
    // A final method is a method that cannot be overridden by any subclass. 
    // It is declared using the final keyword before the method name. 
    // A final method can be inherited by subclasses, but it cannot be overridden. 
    // This means that no subclass can provide a new implementation for a final method, and it cannot be used as a base method for any other method.
    // A final method is useful when you want to create a method that cannot be modified or overridden by other classes.
    // A final method can be called, but it cannot be overridden.

    public final void display() {
        System.out.println("This is a final method");
    }
    
}
