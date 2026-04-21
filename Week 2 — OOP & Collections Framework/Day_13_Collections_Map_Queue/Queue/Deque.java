public class Deque {
    public static void main(String[] args) {
        // A Deque (Double Ended Queue) is a data structure that allows elements to be added or removed from both ends. It is part of the Java Collections Framework and provides methods for working with double-ended queues.
        // Key features of the Deque interface include:
        // 1. Double-Ended: Elements can be added or removed from both the front and the back of the deque.
        // 2. Methods: The Deque interface provides several methods for working with deques, including:
        //    - addFirst(E e): Adds an element to the front of the deque. Throws an exception if the deque is full.
        //    - addLast(E e): Adds an element to the back of the deque. Throws an exception if the deque is full.
        //    - offerFirst(E e): Adds an element to the front of the deque. Returns false if the deque is full.
        //    - offerLast(E e): Adds an element to the back of the deque. Returns false if the deque is full.
        //    - removeFirst(): Removes and returns the first element of the deque. Throws an exception if the deque is empty.
        //    - removeLast(): Removes and returns the last element of the deque. Throws an exception if the deque is empty.
        //    - pollFirst(): Removes and returns the first element of the deque. Returns null if the deque is empty.
        //    - pollLast(): Removes and returns the last element of the deque. Returns null if the deque is empty.
        //    - peekFirst(): Retrieves, but does not remove, the first element of the deque. Returns null if the deque is empty.
        //    - peekLast(): Retrieves, but does not remove, the last element of the deque. Returns null if the deque is empty.
        // 3. Implementations: The most common implementation of a Deque in Java is ArrayDeque, which provides a resizable array implementation of a double-ended queue.
        // Example usage of Deque:

        java.util.Deque<String> deque = new java.util.ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Second");
        deque.addLast("Third");

        System.out.println("Front of the deque: " + deque.peekFirst()); // Output: Front of the deque: First
        System.out.println("Back of the deque: " + deque.peekLast());   // Output: Back of the deque: Third
        System.out.println("Removing from the front of the deque: " + deque.removeFirst()); // Output: Removing from the front of the deque: First
        System.out.println("Front of the deque after removal: " + deque.peekFirst()); // Output: Front of the deque after removal: Second
        System.out.println("Removing from the back of the deque: " + deque.removeLast()); // Output: Removing from the back of the deque: Third
        System.out.println("Back of the deque after removal: " + deque.peekLast()); // Output: Back of the deque after removal: Second
    }

    
}
