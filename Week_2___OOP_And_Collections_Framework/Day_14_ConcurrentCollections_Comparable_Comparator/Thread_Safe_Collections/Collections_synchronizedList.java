public class Collections_synchronizedList {
    public static void main(String[] args) {
        // Collections.synchronizedList() is a method in the Java Collections Framework that returns a thread-safe (synchronized) list backed by the specified list. 
        // It is used to create a synchronized version of a List, which can be safely accessed and modified by multiple threads concurrently.
        // Key features of Collections.synchronizedList() include:
        // 1. Thread Safety: The synchronized list returned by this method is thread-safe, meaning that it can be safely accessed and modified by multiple threads without causing data corruption or inconsistencies.
        // 2. Backed by Original List: The synchronized list is backed by the original list passed as an argument. Any changes made to the synchronized list will also affect the original list, and vice versa.
        // 3. Performance: While Collections.synchronizedList() provides thread safety, it may have performance overhead due to synchronization. It is recommended to use it when you need to ensure thread safety for a List that is accessed by multiple threads.
        // Example usage of Collections.synchronizedList():

        java.util.List<String> originalList = new java.util.ArrayList<>();
        originalList.add("One");
        originalList.add("Two");
        originalList.add("Three");

        java.util.List<String> synchronizedList = java.util.Collections.synchronizedList(originalList);

        // Accessing the synchronized list from multiple threads
        Runnable task = () -> {
            for (String item : synchronizedList) {
                System.out.println(Thread.currentThread().getName() + " - " + item);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
    
}
