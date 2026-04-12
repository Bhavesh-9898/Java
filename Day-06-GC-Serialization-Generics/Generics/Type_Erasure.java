public class Type_Erasure {
    // Type erasure is a process in Java generics where the compiler removes all generic type information during compilation. This means that at runtime, the generic types are not available, and the code operates on raw types instead.

    // For example, if you have a generic class like this:
    // public class Box<T> {
    //     private T content;
    //     public void setContent(T content) {
    //         this.content = content;
    //     }
    //     public T getContent() {
    //         return content;
    //     }
    // }

    // After type erasure, it would be transformed to something like this:
    // public class Box {
    //     private Object content;
    //     public void setContent(Object content) {
    //         this.content = content;
    //     }
    //     public Object getContent() {
    //         return content;
    //     }
    // }

    // This means that you can only use Object as the type for the content variable, and you would need to cast it back to the original type when retrieving it. This is one of the reasons why generics provide type safety at compile time, but not at runtime.
    
}
