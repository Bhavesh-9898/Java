public class Wildcards {
    // In Java, wildcards are represented by the question mark (?) and are used in generics to represent an unknown type. They provide flexibility when working with generic types, allowing you to specify a range of acceptable types without needing to know the exact type at compile time.

    // There are three main types of wildcards in Java:
    // 1. Unbounded Wildcard (?): This wildcard represents an unknown type and can be used when you want to work with any type. For example, List<?> can accept a List of any type.

    // 2. Upper Bounded Wildcard (? extends T): This wildcard is used when you want to specify that a generic type can be of a specific type or any subtype of that type. For example, List<? extends Number> can accept a List of Number or any of its subclasses (like Integer, Double, etc.).

    // 3. Lower Bounded Wildcard (? super T): This wildcard is used when you want to specify that a generic type can be of a specific type or any supertype of that type. For example, List<? super Integer> can accept a List of Integer or any of its supertypes (like Number or Object).

    // Wildcards are particularly useful when working with collections and APIs that need to be flexible in terms of the types they can accept or return. They help to improve code reusability and maintainability by allowing you to write more general code that can work with a wider range of types.
    
}
