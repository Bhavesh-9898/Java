public class Lazy_Evaluation {
    public static void main(String[] args) {
        // Lazy evaluation in Java 8 Stream API means that intermediate operations are not executed until a terminal operation is invoked.
        // This allows for efficient processing of data, as it avoids unnecessary computations.

        // Example of lazy evaluation
        java.util.List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Intermediate operations (lazy)
        java.util.stream.Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.startsWith("A");
                })
                .map(name -> {
                    System.out.println("Mapping: " + name);
                    return name.toUpperCase();
                });

        // Terminal operation (triggers the execution of intermediate operations)
        java.util.List<String> result = stream.collect(java.util.stream.Collectors.toList());
        System.out.println("Result: " + result);
    }
    
}
