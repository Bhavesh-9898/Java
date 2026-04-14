package Examples.Extends_Class;
public class Electric_Car extends Cars {

    void charge() {
        System.out.println("Electric car is charging");
    }

    public static void main(String[] args) {
        Electric_Car tesla = new Electric_Car();

        tesla.start();
        tesla.drive();
        tesla.charge();
    }
}