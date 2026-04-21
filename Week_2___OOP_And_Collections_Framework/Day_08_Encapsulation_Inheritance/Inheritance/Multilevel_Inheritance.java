public class Multilevel_Inheritance {
    // In multilevel inheritance, a class inherits from a class that is already a subclass of another class.
    // This creates a chain of inheritance, allowing for more complex hierarchies.
    // Example:

    class A {
        void methodA() {
            System.out.println("Method A");
        }
    }

    class B extends A {
        void methodB() {
            System.out.println("Method B");
        }
    }

    class C extends B {
        void methodC() {
            System.out.println("Method C");
        }
    }

}
