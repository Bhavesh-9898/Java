class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

public class Composition {
    // Composition is a design principle in object-oriented programming where one class contains a reference to another class, indicating a "has-a" relationship.
    // It allows for the creation of complex types by combining simpler types. In composition, the contained object is typically created and managed by the containing class.
    // For example, if we have a class "Car" that contains an instance of a class "Engine", we can say that a Car "has an" Engine. The Car class can use the Engine class to perform its functions, and the Engine class can be reused in other contexts as well.

    private Engine engine;

    public Composition() {
        this.engine = new Engine();
    }

    public void startCar() {
        engine.start();
    }
    
}
