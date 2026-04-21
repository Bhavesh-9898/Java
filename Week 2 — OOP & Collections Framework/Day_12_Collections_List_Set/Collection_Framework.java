import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_Framework {

    // Collections Framework in Java is a set of classes and interfaces that implement commonly reusable collection data structures.
        // It provides various data structures like List, Set, Queue, and Map to store and manipulate groups of objects.
        // The Collections Framework provides algorithms to perform operations like sorting, searching, and modifying collections.
        // It is part of the java.util package and is widely used in Java programming for efficient data management and manipulation.
        // The main interfaces in the Collections Framework include:
        // 1. Collection: The root interface of the collection hierarchy.
        // 2. List: An ordered collection that allows duplicate elements (e.g., ArrayList, LinkedList).
        // 3. Set: A collection that does not allow duplicate elements (e.g., HashSet, TreeSet).
        // 4. Queue: A collection used to hold multiple elements prior to processing (e.g., LinkedList, PriorityQueue).
        // 5. Map: An object that maps keys to values, where each key is unique (e.g., HashMap, TreeMap).
    public static void main(String[] args) {
        // Example of using a List
        
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("List: " + list);

        // Example of using a Set
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Hello"); // Duplicate element will not be added
        System.out.println("Set: " + set);
    }
}