public class Private_Instance_Variables {

    // Private instance variables 
    // These variables can only be accessed within this class
    // To access and modify these variables, we use public getter and setter methods
    // This is a common practice in Java to achieve encapsulation
    // Encapsulation is the principle of hiding the internal state of an object and requiring all interaction to be performed through an object's methods
    // This allows us to control how the data is accessed and modified, and it also helps to protect the integrity of the data
    // In this example, we have a class called Private_Instance_Variables with two private instance variables: name and age. 
    // We also have a constructor to initialize these variables and getter and setter methods to access and modify them.

    private String name;
    private int age;

    public Private_Instance_Variables(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
