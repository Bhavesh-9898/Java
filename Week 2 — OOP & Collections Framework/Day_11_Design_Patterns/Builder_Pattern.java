public class Builder_Pattern {
    // The Builder Pattern is a design pattern that allows for the step-by-step construction of complex objects. 
    // It separates the construction of an object from its representation, allowing the same construction process to create different representations.
    // The Builder Pattern typically involves the following components:
    // 1. Builder: An interface that defines the methods for creating the different parts of the product.
    // 2. ConcreteBuilder: A class that implements the Builder interface and provides specific implementations for creating the parts of the product.
    // 3. Director: A class that constructs the product using the Builder interface. It defines the order in which to call the building steps.
    // 4. Product: The complex object that is being built.
    // Example:
    // Builder Interface
  static class House {
    private String walls;
    private String roof;
    private String floor;

    void setWalls(String walls) {
      this.walls = walls;
    }

    void setRoof(String roof) {
      this.roof = roof;
    }

    void setFloor(String floor) {
      this.floor = floor;
    }
  }

  interface HouseBuilder {
    void buildWalls();

    void buildRoof();

    void buildFloor();

    House getHouse();
  }

  static class ConcreteHouseBuilder implements HouseBuilder {
    private House house = new House();

    public void buildWalls() {
      house.setWalls("Concrete walls");
    }

    public void buildRoof() {
      house.setRoof("Concrete roof");
    }

    public void buildFloor() {
      house.setFloor("Concrete floor");
    }

    public House getHouse() {
      return house;
    }
  }

  static class Director {
    private HouseBuilder builder;

    public Director(HouseBuilder builder) {
      this.builder = builder;
    }

    public void constructHouse() {
      builder.buildWalls();
      builder.buildRoof();
      builder.buildFloor();
    }
  }

  public static void main(String[] args) {
    HouseBuilder builder = new ConcreteHouseBuilder();
    Director director = new Director(builder);
    director.constructHouse();
    builder.getHouse();
  }
}
