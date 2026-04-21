import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_Hierarchy {
    // The Collection Hierarchy in Java is a structured organization of interfaces and classes that define various types of collections.
        // At the top of the hierarchy is the Collection interface, which is the root interface for all collection types.
        // Below the Collection interface, there are several subinterfaces that represent specific types of collections:
        // 1. List: An ordered collection that allows duplicate elements (e.g., ArrayList, LinkedList).
        // 2. Set: A collection that does not allow duplicate elements (e.g., HashSet, TreeSet).
        // 3. Queue: A collection used to hold multiple elements prior to processing (e.g., LinkedList, PriorityQueue).
        // 4. Deque: A double-ended queue that allows insertion and removal from both ends (e.g., ArrayDeque).
        // Each of these subinterfaces has its own implementations that provide specific behaviors and performance characteristics.

        //Example of Collection Hierarchy
        // Collection
        // ├── List
        // │   ├── ArrayList
        // │   └── LinkedList
        // ├── Set
        // │   ├── HashSet
        // │   └── TreeSet
        // ├── Queue
        // │   ├── LinkedList
        // │   └── PriorityQueue
        // └── Deque
        //     └── ArrayDeque

        //One example of using the Collection Hierarchy is when we want to store a list of unique items. 
        // We can use a Set to ensure that duplicates are not allowed, while still benefiting from the collection's ability to manage and manipulate the data efficiently.
    public static void main(String[] args) {
        // Using a List to store ordered elements
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);

        // Using a Set to store unique elements
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element will not be added
        System.out.println("Set: " + set);
    }
    
}
