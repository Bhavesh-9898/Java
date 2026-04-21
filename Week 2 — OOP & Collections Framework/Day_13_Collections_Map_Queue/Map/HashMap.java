public class HashMap {
    public static void main(String[] args) {
        // HashMap is a Map implementation that uses a hash table to store key-value pairs.
        // It is part of the Java Collections Framework and provides constant time complexity (O(1)) for basic operations like get, put, and remove, assuming a good hash function and low collision rate.
        // Key features of HashMap include:
        // 1. Unordered: HashMap does not maintain any order of its entries. The order of keys and values may change over time as new entries are added or removed.
        // 2. Null Keys and Values: HashMap allows one null key and multiple null values. However, it is generally recommended to avoid using null keys in a HashMap to prevent potential issues with hashing and retrieval.
        // 3. Performance: HashMap provides constant time complexity for basic operations, but performance can degrade if there are many collisions (i.e., multiple keys hashing to the same bucket). In such cases, the time complexity can degrade to O(n) in the worst case.
        // Example usage of HashMap:
        java.util.HashMap<String, Integer> hashMap = new java.util.HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);

        System.out.println("Value for key 'Banana': " + hashMap.get("Banana")); // Output: Value for key 'Banana': 2
        System.out.println("Contains key 'Cherry': " + hashMap.containsKey("Cherry")); // Output: Contains key 'Cherry': true
        System.out.println("Size of the HashMap: " + hashMap.size()); // Output: Size of the HashMap: 3

        hashMap.remove("Apple");
        System.out.println("Contains key 'Apple' after removal: " + hashMap.containsKey("Apple")); // Output: Contains key 'Apple' after removal: false
    }

    
}
