public class Static_Variables {
    // Static variables, also known as class variables, are declared using the 'static' keyword. They belong to the class rather than any specific instance of the class. This means that all instances of the class share the same static variable. Static variables are initialized only once, at the time of class loading, and they can be accessed directly using the class name without creating an instance of the class.

    static int count = 0; // This is a static variable
    public Static_Variables() {
        count++; // Increment the static variable count whenever a new instance is created
    }
}