public class static_Method {
    // A static method is a method that belongs to the class rather than an instance of the class. 
    // It can be called without creating an object of the class. 
    // Static methods are declared using the static keyword before the method name. 
    // They can access only static variables and call only other static methods directly. 
    // Static methods cannot access instance variables or instance methods directly because they do not have a reference to any specific object.
    // A static method can be called using the class name, followed by a dot (.) and the method name.

    public static void display() {
        System.out.println("This is a static method");
    }
    
}
