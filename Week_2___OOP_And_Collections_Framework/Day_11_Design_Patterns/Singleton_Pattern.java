public class Singleton_Pattern {
    // The Singleton Pattern is a design pattern that restricts the instantiation of a class to a single instance and provides a global point of access to that instance. This is useful when exactly one object is needed to coordinate actions across the system.
    // The Singleton Pattern typically involves the following components:  
    // 1. Private Constructor: The constructor of the class is made private to prevent direct instantiation from outside the class.
    // 2. Static Variable: A static variable is used to hold the single instance of the class.
    // 3. Static Method: A static method is provided to return the single instance of the class. This method checks if the instance already exists; if it does, it returns the existing instance, otherwise, it creates a new instance and returns it.
    // Example:

    public static class Singleton {
        private static Singleton instance;

        private Singleton() {
            // Private constructor to prevent instantiation
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}