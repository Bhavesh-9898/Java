public class LinkedHashMap {
    public static void main(String[] args) {
        // LinkedHashMap is a Map implementation that maintains the order of insertion of key-value pairs.
        // It is part of the Java Collections Framework and extends the HashMap class, providing additional features for maintaining the order of entries.
        // Key features of LinkedHashMap include:
        // 1. Insertion Order: LinkedHashMap maintains the order of entries based on the order in which they were inserted. When you iterate over a LinkedHashMap, it will return the entries in the same order they were added.
        // 2. Performance: LinkedHashMap provides constant time complexity (O(1)) for basic operations like get, put, and remove, similar to HashMap. However, it may have slightly higher overhead due to maintaining the linked list for order.
        // 3. Null Keys and Values: Like HashMap, LinkedHashMap allows one null key and multiple null values.
        // Example usage of LinkedHashMap:
        java.util.LinkedHashMap<String, Integer> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Cherry", 3);

        System.out.println("Value for key 'Banana': " + linkedHashMap.get("Banana")); // Output: Value for key 'Banana': 2
        System.out.println("Contains key 'Cherry': " + linkedHashMap.containsKey("Cherry")); // Output: Contains key 'Cherry': true
        System.out.println("Size of the LinkedHashMap: " + linkedHashMap.size()); // Output: Size of the LinkedHashMap: 3

        linkedHashMap.remove("Apple");
        System.out.println("Contains key 'Apple' after removal: " + linkedHashMap.containsKey("Apple")); // Output: Contains key 'Apple' after removal: false
    }


    
}
