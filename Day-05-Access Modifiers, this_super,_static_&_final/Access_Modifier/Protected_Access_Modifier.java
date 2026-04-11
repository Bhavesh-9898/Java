public class Protected_Access_Modifier {

    // Protected access modifier allows access to the members of the class within the same package and subclasses in other packages.
    // It is denoted by the keyword "protected".
    // It is less restrictive than private access modifier but more restrictive than public access modifier.
    // It is commonly used when you want to allow access to the members of the class to subclasses but not to other classes in the same package.
    // It is also used when you want to allow access to the members of the class to other classes in the same package but not to subclasses in other packages.
    // It is important to note that protected access modifier does not allow access to the members of the class from outside the package unless it is accessed through inheritance.
    // It is also important to note that protected access modifier does not allow access to the members of the class from outside the package unless it is accessed through inheritance.
    
    protected String name;
    protected int age;

    protected Protected_Access_Modifier() {
        System.out.println("This is a protected access modifier constructor");
    }

    protected void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public Protected_Access_Modifier(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        display();
    }

}