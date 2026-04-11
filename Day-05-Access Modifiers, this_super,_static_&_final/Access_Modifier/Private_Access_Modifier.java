public class Private_Access_Modifier {
    // Private access modifier is the most restrictive access level. 
    // It allows access to the members of the class only within the same class. 
    // It is denoted by the keyword "private".
    private String name;
    private int age;
    private void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public Private_Access_Modifier(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        display();
    }
    
    
}
