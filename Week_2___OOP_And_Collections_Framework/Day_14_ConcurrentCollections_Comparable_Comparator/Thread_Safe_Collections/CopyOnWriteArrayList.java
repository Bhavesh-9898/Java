public class CopyOnWriteArrayList {
    public static void main(String[] args) {
        // CopyOnWriteArrayList is a thread-safe variant of ArrayList that creates a new copy of the underlying array every time it is modified. 
        // It is part of the java.util.concurrent package and is designed to provide thread safety while allowing concurrent read operations without blocking.
        // Key features of CopyOnWriteArrayList include:
        // 1. Thread Safety: CopyOnWriteArrayList is designed to be thread-safe, allowing multiple threads to read from the list concurrently without causing data corruption or inconsistencies.
        // 2. Copy-on-Write Mechanism: When a modification operation (such as add, remove, or set) is performed on the list, a new copy of the underlying array is created, and the modification is applied to the new array. This allows for concurrent read operations without blocking.
        // 3. Performance: While CopyOnWriteArrayList provides thread safety, it may have performance overhead due to the need to create a new copy of the array for each modification. It is recommended to use it in scenarios where read operations are more frequent than write operations.
        // Example usage of CopyOnWriteArrayList:

        java.util.concurrent.CopyOnWriteArrayList<String> copyOnWriteList = new java.util.concurrent.CopyOnWriteArrayList<>();
        copyOnWriteList.add("One");
        copyOnWriteList.add("Two");
        copyOnWriteList.add("Three");

        // Accessing the CopyOnWriteArrayList from multiple threads
        Runnable task = () -> {
            for (String item : copyOnWriteList) {
                System.out.println(Thread.currentThread().getName() + " - " + item);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
    
}
