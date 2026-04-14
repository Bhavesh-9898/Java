public class static_Keyword {
    // The static keyword in Java is used to indicate that a particular member (variable or method) belongs to the class rather than to instances of the class. 
    // This means that static members can be accessed without creating an instance of the class. 
    // Static variables are shared among all instances of the class, while static methods can be called without creating an object of the class.

    public static void main(String[] args) {
        // Accessing a static method without creating an instance of the class
        displayMessage();
    }
    
    public static void displayMessage() {
        System.out.println("Hello from static method!");
    }
}
