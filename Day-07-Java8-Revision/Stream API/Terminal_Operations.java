public class Terminal_Operations {
    public static void main(String[] args) {
        // Terminal operations are operations that trigger the execution of the stream pipeline and produce a result or a side effect.
        // They are not lazy and will execute all intermediate operations in the stream.

        // Example of terminal operations
        java.util.List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie", "David");

        long count = names.stream()
                .filter(name -> name.startsWith("A")) // Intermediate operation: filter
                .count(); // Terminal operation: count

        System.out.println("Count of names starting with 'A': " + count);
    }
    
}
