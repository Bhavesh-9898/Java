public class Observer_Pattern {
    // The Observer Pattern is a design pattern that defines a one-to-many relationship between objects, where one object (the subject) maintains a list of its dependents (observers) and notifies them of any state changes, usually by calling one of their methods.
    // The Observer Pattern typically involves the following components:
    // 1. Subject: An interface or abstract class that defines methods for attaching, detaching, and notifying observers.
    // 2. ConcreteSubject: A class that implements the Subject interface and maintains the state of interest to the observers. It also implements the methods to attach, detach, and notify observers.
    // 3. Observer: An interface that defines a method for receiving updates from the subject.
    // 4. ConcreteObserver: A class that implements the Observer interface and maintains a reference to the ConcreteSubject. It updates its state based on notifications from the subject.
    // Example:
    // Subject Interface
        interface Observer {
            void update();
        }
        
        interface Subject {
          void attach(Observer observer);
          void detach(Observer observer);
          void notifyObservers();
        }   
    
}
