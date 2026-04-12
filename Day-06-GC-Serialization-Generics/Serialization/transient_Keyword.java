public class transient_Keyword {
    // The transient keyword in Java is used to indicate that a field should not be serialized when an object is serialized. When a field is marked as transient, it will be ignored during the serialization process, and its value will not be saved to the byte stream. This is useful for fields that contain sensitive information or for fields that can be easily recalculated and do not need to be stored.

    // For example, if you have a class with a transient field like this:
    /*
    import java.io.Serializable;

    public class MyClass implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private transient int age; // This field will not be serialized

        public MyClass(String name, int age) {
            this.name = name;
            this.age = age;
    
}
*/

    // When you serialize an instance of MyClass, the name field will be saved to the byte stream, but the age field will not be included. When you deserialize the object, the age field will be set to its default value (0 for int) since it was not serialized.

    public static void main(String[] args) {
        // This main method can be used to test the transient keyword by creating an instance of a class with a transient field, serializing it to a file, and then deserializing it back into an object to see the effect of the transient keyword.
        
    }
    
}