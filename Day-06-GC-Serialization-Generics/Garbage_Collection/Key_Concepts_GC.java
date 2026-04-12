public class Key_Concepts_GC {
    // 1. Memory Management: GC automatically manages memory allocation and deallocation, preventing memory leaks and dangling pointers.
    
    // 2. Generational Hypothesis: GC divides objects into generations (young, old) based on their age, optimizing collection by focusing on younger objects that are more likely to be garbage.
    
    // 3. Mark-and-Sweep Algorithm: GC marks reachable objects and sweeps away unmarked ones, reclaiming memory efficiently.
    
    // 4. Reference Counting: Some GC implementations use reference counting to track object references, but it can lead to issues like circular references.
    
    // 5. Stop-the-World Events: During GC cycles, the application may pause (stop-the-world) to allow the GC to perform its tasks, which can impact performance.
    
    // 6. Finalization: Objects can have a finalize() method that is called before garbage collection, but relying on it is discouraged due to unpredictability.
}