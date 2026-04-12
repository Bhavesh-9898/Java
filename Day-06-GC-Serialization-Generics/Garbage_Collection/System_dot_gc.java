public class System_dot_gc {

    // The System.gc() method is a request to the JVM to perform garbage collection.
    // It is important to note that calling System.gc() does not guarantee that the garbage collection will occur immediately. 
    // The JVM may choose to ignore the request or delay it based on its own optimization strategies.  
    // However, it can be useful for testing and debugging purposes to suggest that the JVM performs garbage collection at a specific point in the code. 

        public static void main(String[] args) {
            System.gc();
        }
    
}
