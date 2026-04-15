abstract class AbstractClass {

    // Abstract methods (without implementation)
    // These methods must be implemented by any concrete subclass.
    // Abstract methods do not have a body and are declared with the 'abstract' keyword.
    // They can have any access modifier (public, protected, private) and can also be static or final.
    // Abstract methods are meant to be overridden in subclasses, and they define a contract that the subclasses must follow.
    // In this example, we have three abstract methods: method1(), method2(), and method3().
    // Concrete method (with implementation)
    // This method has a body and can be used as is by subclasses or overridden if needed
    // Concrete methods can provide common functionality that can be shared across all subclasses, while abstract methods enforce that certain behaviors must be implemented by the subclasses.

    abstract void method1();
    abstract void method2();
    void method3() {
        System.out.println("This is a concrete method in abstract class");
    }
}

class ConcreteClass extends AbstractClass {
    @Override
    void method1() {
        System.out.println("Implementation of method1");
    }
    
    @Override
    void method2() {
        System.out.println("Implementation of method2");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        // AbstractClass obj = new AbstractClass(); // This will give an error because we cannot instantiate an abstract class.
        ConcreteClass concreteObj = new ConcreteClass();
        concreteObj.method1();
        concreteObj.method2();
        concreteObj.method3();
    }
    
}
