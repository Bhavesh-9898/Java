public class Intermediate_Operations {



    public static void main(String[] args) {
        // Intermediate operations are operations that return a new stream and can be chained together.
        // They are lazy, meaning they are not executed until a terminal operation is invoked on the stream.

        // Example of intermediate operations
        java.util.List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.stream()
                .filter(name -> name.startsWith("A")) // Intermediate operation: filter
                .map(String::toUpperCase) // Intermediate operation: map
                .forEach(System.out::println); // Terminal operation: forEach
    }
    
}
