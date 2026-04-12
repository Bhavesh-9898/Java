public class PECS_Principle {
    // PECS stands for "Producer Extends, Consumer Super". It is a principle in Java generics that helps to determine whether to use "extends" or "super" when working with generic types.

    // 1. Producer Extends: If a generic type is producing (or returning) values, you should use "extends". This allows you to read from the generic type safely. For example, if you have a List<? extends Number>, you can read elements from the list as Number or any of its subclasses (like Integer, Double, etc.), but you cannot add elements to the list.

    // 2. Consumer Super: If a generic type is consuming (or accepting) values, you should use "super". This allows you to write to the generic type safely. For example, if you have a List<? super Integer>, you can add Integer values to the list, but you cannot read elements from the list as Integer because it could be a List of any superclass of Integer (like Number or Object).

    // In summary:
    // - Use "extends" when you want to read from a generic type (producer).
    // - Use "super" when you want to write to a generic type (consumer).
    
}
