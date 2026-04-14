public class Common_Functional_Interfaces {
    public static void main(String[] args) {
        // Common functional interfaces in Java 8 include:
        // 1. Function<T, R>: Represents a function that takes an argument of type T and returns a result of type R.
        // 2. Consumer<T>: Represents an operation that takes an argument of type T and returns no result.
        // 3. Supplier<T>: Represents a supplier of results of type T.
        // 4. Predicate<T>: Represents a predicate (boolean-valued function) of one argument of type T.

        // Example usage of Function
        java.util.function.Function<Integer, String> intToString = Object::toString;
        System.out.println("Function example: " + intToString.apply(123)); // Output: "123"

        // Example usage of Consumer
        java.util.function.Consumer<String> printConsumer = System.out::println;
        System.out.print("Consumer example: ");
        printConsumer.accept("Hello, World!"); // Output: "Hello, World!"

        // Example usage of Supplier
        java.util.function.Supplier<Double> randomSupplier = Math::random;
        System.out.println("Supplier example: " + randomSupplier.get()); // Output: A random number between 0.0 and 1.0

        // Example usage of Predicate
        java.util.function.Predicate<String> isEmptyPredicate = String::isEmpty;
        System.out.println("Predicate example: " + isEmptyPredicate.test("")); // Output: true
    }
    
}
