import java.util.HashMap;
import java.util.Map;

public class Map_Interface {
    // A Map is a collection that maps keys to values, where each key is unique and can only map to one value.
    // The Map interface is part of the Java Collections Framework and provides methods for storing and manipulating
    // key-value pairs. It does not extend the Collection interface, but it is still considered a collection in a broader sense.
    // Key features of the Map interface include:
    // 1. Key-Value Pairs: Each entry in a Map consists of a key and a corresponding value. The key is used to retrieve the value.
    // 2. Unique Keys: Each key in a Map must be unique. If you try to insert a duplicate key, the new value will overwrite the existing value associated with that key.
    // 3. Null Keys and Values: Depending on the implementation, a Map can allow null keys and values. For example, HashMap allows one null key and multiple null values, while TreeMap does not allow null keys.
    // 4. Implementations: There are several implementations of the Map interface, including HashMap, TreeMap, LinkedHashMap, and Hashtable, each with its own characteristics and performance trade-offs.
    // Common methods in the Map interface include:
    // - put(K key, V value): Associates the specified value with the specified key in the map.
    // - get(Object key): Returns the value to which the specified key is mapped, or null if the map contains no mapping for the key.
    // - remove(Object key): Removes the mapping for the specified key from the map if present.
    // - containsKey(Object key): Returns true if the map contains a mapping for the specified key.
    // - containsValue(Object value): Returns true if the map maps one or more keys to the specified value.
    // - size(): Returns the number of key-value mappings in the map.   
    // Example usage of a Map:
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for key 'Two': " + map.get("Two")); // Output: Value for key 'Two': 2
        System.out.println("Contains key 'Three': " + map.containsKey("Three")); // Output: Contains key 'Three': true
        System.out.println("Size of the map: " + map.size()); // Output: Size of the map: 3

        map.remove("One");
        System.out.println("Contains key 'One' after removal: " + map.containsKey("One")); // Output: Contains key 'One' after removal: false
    }   
    
}
