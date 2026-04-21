public class ConcurrentHashMap {
    public static void main(String[] args) {
        // ConcurrentHashMap is a thread-safe variant of HashMap that allows concurrent read and write operations without the need for external synchronization. 
        // It is part of the java.util.concurrent package and is designed to provide high concurrency while maintaining thread safety.
        // Key features of ConcurrentHashMap include:
        // 1. Thread Safety: ConcurrentHashMap is designed to be thread-safe, allowing multiple threads to read and write to the map concurrently without causing data corruption or inconsistencies.
        // 2. Segmentation: ConcurrentHashMap uses a segmented locking mechanism, which allows multiple threads to access different segments of the map simultaneously, improving performance in multi-threaded environments.
        // 3. No Null Keys or Values: ConcurrentHashMap does not allow null keys or values. Attempting to insert a null key or value will result in a NullPointerException.
        // Example usage of ConcurrentHashMap:

        java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentMap = new java.util.concurrent.ConcurrentHashMap<>();
        concurrentMap.put("One", 1);
        concurrentMap.put("Two", 2);
        concurrentMap.put("Three", 3);

        // Accessing the ConcurrentHashMap from multiple threads
        Runnable task = () -> {
            for (String key : concurrentMap.keySet()) {
                System.out.println(Thread.currentThread().getName() + " - " + key + ": " + concurrentMap.get(key));
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
    
}
