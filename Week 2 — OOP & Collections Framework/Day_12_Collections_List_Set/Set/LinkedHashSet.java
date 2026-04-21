public class LinkedHashSet {
    // A LinkedHashSet is a collection that implements the Set interface and is backed by a hash table and a linked list.
        // It maintains the insertion order of the elements, meaning that the elements will be returned in the order they were added.
        // Like HashSet, LinkedHashSet does not allow duplicate elements and provides constant-time performance for basic operations like add, remove, and contains.
        // The linked list maintains a doubly-linked list running through all of its entries, which allows for predictable iteration order.
        // LinkedHashSet is part of the java.util package and is commonly used when you want to store unique elements while preserving their insertion order.
    public static void main(String[] args) {
        // Example of using a LinkedHashSet
        java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet<>();
        linkedHashSet.add("First");
        linkedHashSet.add("Second");
        linkedHashSet.add("Third");
        linkedHashSet.add("First"); // Duplicate element will not be added
        System.out.println("Linked Hash Set: " + linkedHashSet);
    }
    
}
