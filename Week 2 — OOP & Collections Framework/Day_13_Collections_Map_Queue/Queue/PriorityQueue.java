public class PriorityQueue {
    public static void main(String[] args) {
        // A PriorityQueue is a data structure that allows elements to be added and removed based on their priority. 
        // It is part of the Java Collections Framework and provides methods for working with priority queues.
        // Key features of the PriorityQueue class include:
        // 1. Priority Ordering: Elements in a PriorityQueue are ordered based on their natural ordering (if they implement Comparable) or by a Comparator provided at the time of queue creation. 
        // The element with the highest priority (lowest value) is removed first.
        // 2. Methods: The PriorityQueue class provides several methods for working with priority queues, including:
        //    - add(E e): Adds an element to the priority queue. Throws an exception if the queue is full.
        //    - offer(E e): Adds an element to the priority queue. Returns false if the queue is full.
        //    - remove(): Removes and returns the head of the priority queue. Throws an exception if the queue is empty.
        //    - poll(): Removes and returns the head of the priority queue. Returns null if the queue is empty.
        //    - peek(): Retrieves, but does not remove, the head of the priority queue. Returns null if the queue is empty.
        // 3. Implementations: The most common implementation of a PriorityQueue in Java is a binary heap, which provides efficient insertion and removal of elements based on their priority.
        // Example usage of PriorityQueue:

        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

        System.out.println("Head of the priority queue: " + pq.peek()); // Output: Head of the priority queue: 1
        System.out.println("Removing from the priority queue: " + pq.remove()); // Output: Removing from the priority queue: 1
        System.out.println("Head of the priority queue after removal: " + pq.peek()); // Output: Head of the priority queue after removal: 2
    }   
    
}
