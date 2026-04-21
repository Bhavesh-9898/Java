public class Queue_Interface {
    public static void main(String[] args) {
        // Queue is a collection interface in Java that represents a data structure that follows the First-In-First-Out (FIFO) principle.
        // It is part of the Java Collections Framework and provides methods for adding, removing, and inspecting elements in a queue.
        // Key features of the Queue interface include:
        // 1. FIFO Order: Elements in a queue are processed in the order they were added. The first element added to the queue will be the first one to be removed.
        // 2. Methods: The Queue interface provides several methods for working with queues, including:
        //    - add(E e): Adds an element to the end of the queue. Throws an exception if the queue is full.
        //    - offer(E e): Adds an element to the end of the queue. Returns false if the queue is full.
        //    - remove(): Removes and returns the head of the queue. Throws an exception if the queue is empty.
        //    - poll(): Removes and returns the head of the queue. Returns null if the queue is empty.
        //    - peek(): Retrieves, but does not remove, the head of the queue. Returns null if the queue is empty.
        // 3. Implementations: There are several implementations of the Queue interface in Java, including LinkedList, PriorityQueue, and ArrayDeque, each with its own characteristics and use cases.  
        // Example usage of Queue:
        java.util.Queue<String> queue = new java.util.LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Head of the queue: " + queue.peek()); // Output: Head of the queue: First
        System.out.println("Removing from the queue: " + queue.remove()); // Output: Removing from the queue: First
        System.out.println("Head of the queue after removal: " + queue.peek()); // Output: Head of the queue after removal: Second
    }
    
}
