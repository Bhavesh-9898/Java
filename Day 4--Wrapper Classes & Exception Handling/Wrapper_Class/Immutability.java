public class Immutability {
    
    // Wrapper classes in Java are immutable, meaning that once an instance of a wrapper class is created, its value cannot be changed. This immutability provides several benefits:
    // 1. Thread Safety: Immutable objects can be safely shared between multiple threads without the need for synchronization, as their state cannot be modified after creation.
    // 2. Caching: Since immutable objects cannot change, they can be cached and reused without the risk of unintended side effects. For example, Integer values between -128 and 127 are cached by the JVM.
    // 3. Simplicity: Immutable objects are easier to reason about and debug, as their state is fixed and cannot be altered unexpectedly.
    // Example of immutability with wrapper classes:

    public static void main(String[] args) {
        Integer a = 10; // Creating an Integer object
        System.out.println("Original Integer: " + a);
        
        a = 20; // This creates a new Integer object with the value 20, rather than modifying the original object
        System.out.println("Modified Integer: " + a);
    }
    
}
