package Week_3___Multithreading_And_Spring_Boot.Day_17_ThreadPools_Concurrency_Deadlock.Deadlock;

public class Prevention_Strategies {

/*
- Lock ordering
- Timeout locks
- Avoid nested locks
- Reduce shared resources
 */

// Example of lock ordering:
    // Define a consistent order for acquiring locks to prevent circular wait conditions.
    // For instance, if Thread A needs Lock 1 and then Lock 2, and Thread B needs Lock 2 and then Lock 1, you can enforce that both threads acquire locks in the same order (e.g., always acquire Lock 1 before Lock 2).
public static void main(String[] args) {
    System.out.println("To prevent deadlocks, you can use strategies such as lock ordering, timeout locks, avoiding nested locks, and reducing shared resources.");
    
}
}
