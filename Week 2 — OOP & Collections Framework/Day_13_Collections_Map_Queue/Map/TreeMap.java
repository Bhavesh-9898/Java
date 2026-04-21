public class TreeMap {
    public static void main(String[] args) {
        // TreeMap is a Map implementation that stores key-value pairs in a sorted order based on the natural ordering of the keys or a custom comparator.
        // It is part of the Java Collections Framework and implements the NavigableMap interface, which provides additional methods for navigation and retrieval of entries.
        // Key features of TreeMap include:
        // 1. Sorted Order: TreeMap maintains its entries in sorted order based on the keys. By default, it uses the natural ordering of the keys (e.g., alphabetical for Strings, numerical for Integers), but you can also provide a custom Comparator to define your own sorting logic.
        // 2. No Null Keys: TreeMap does not allow null keys. If you try to insert a null key, it will throw a NullPointerException. However, it does allow null values.
        // 3. Performance: TreeMap provides logarithmic time complexity (O(log n)) for basic operations like get, put, and remove due to its underlying Red-Black tree structure.
        // Example usage of TreeMap:
        java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<>();
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 3);

        System.out.println("Value for key 'Banana': " + treeMap.get("Banana")); // Output: Value for key 'Banana': 2
        System.out.println("Contains key 'Cherry': " + treeMap.containsKey("Cherry")); // Output: Contains key 'Cherry': true
        System.out.println("Size of the TreeMap: " + treeMap.size()); // Output: Size of the TreeMap: 3

        treeMap.remove("Apple");
        System.out.println("Contains key 'Apple' after removal: " + treeMap.containsKey("Apple")); // Output: Contains key 'Apple' after removal: false
    }
    
}
