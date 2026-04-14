public class Instance_Variables { 
    // Instance variables are declared inside a class but outside of any method, constructor, or block. They are also known as non-static fields. Each instance of the class has its own copy of the instance variables. 
     String name;
     int age;
     public static void main(String[] args) {
         Instance_Variables person1 = new Instance_Variables();
         person1.name = "Adesh";
         person1.age = 30;
           
         Instance_Variables person2 = new Instance_Variables();
         person2.name = "Hrushikesh"; 
         person2.age = 25; 

         System.out.println("Person 1: " + person1.name + ", Age: " + person1.age); 
         System.out.println("Person 2: " + person2.name + ", Age: " + person2.age); 
        }

    }