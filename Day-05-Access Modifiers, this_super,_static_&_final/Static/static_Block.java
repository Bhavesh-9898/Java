public class static_Block {

    // A static block is a block of code that is executed when the class is loaded into memory. 
    // It is declared using the static keyword before the block of code.
    // A static block is executed only once, when the class is first loaded, and it is executed before any static methods or variables are accessed.
    // A static block is useful for initializing static variables or performing any setup that needs to be done before the class is used.
    // A static block can access static variables and static methods, but it cannot access instance variables or instance methods.

    static {
        System.out.println("This is a static block!");
    }

    public static void main(String[] args) {
        System.out.println("This is the main method!");
    }
}
