public class static_Variable {
    // A static variable is a variable that belongs to the class rather than to instances of the class.
    // It is declared with the static keyword.
    // Static variables are shared among all instances of the class.
    // They are initialized when the class is loaded into memory.

    public static void main(String[] args) {
        // Accessing a static variable without creating an instance of the class
        System.out.println("Static variable value: " + staticValue);
    }

    public static int staticValue = 10; // Static variable
}
