public class Multiple_Inheritance {
    // Multiple inheritance is a feature in which a class can inherit from more than one parent class.
    // This allows for greater flexibility in designing class hierarchies, but it can also lead to ambiguity if not used carefully.
    // Example:

    interface A {
        void methodA();
    }

    interface B {
        void methodB();
    }

    class C implements A, B {
        public void methodA() {
            System.out.println("Method A");
        }

        public void methodB() {
            System.out.println("Method B");
        }
    }
    
}
