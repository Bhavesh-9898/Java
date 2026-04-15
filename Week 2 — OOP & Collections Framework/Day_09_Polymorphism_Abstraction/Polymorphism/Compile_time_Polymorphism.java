public class Compile_time_Polymorphism {
    // Method overloading is a form of compile-time polymorphism where multiple methods have the same name but different parameters (either in number, type, or both).
    // The compiler determines which method to call based on the method signature at compile time.
    // This allows us to use the same method name for different functionalities, improving code readability and maintainability.

    // Example of method overloading
    void display(int a) {
        System.out.println("Method with one integer parameter: " + a);
    }

    void display(String str) {
        System.out.println("Method with one string parameter: " + str);
    }

    void display(int a, String str) {
        System.out.println("Method with an integer and a string parameter: " + a + ", " + str);
    }

    public static void main(String[] args) {
        Compile_time_Polymorphism obj = new Compile_time_Polymorphism();
        obj.display(10); // Calls the method with one integer parameter
        obj.display("Hello"); // Calls the method with one string parameter
        obj.display(20, "World"); // Calls the method with an integer and a string parameter
    }

    
}