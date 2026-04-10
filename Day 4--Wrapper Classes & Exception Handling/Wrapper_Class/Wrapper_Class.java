public class Wrapper_Class {

    // Wrapper classes in Java are used to convert primitive data types into objects. Each primitive type has a corresponding wrapper class:
    // byte -> Byte
    // short -> Short
    // int -> Integer
    // long -> Long
    // float -> Float
    // double -> Double
    // char -> Character
    // boolean -> Boolean
    // Wrapper classes provide methods to convert between primitive types and their corresponding wrapper objects, as well as utility methods for operations like parsing strings into numbers.
    // Autoboxing is the automatic conversion of a primitive type to its corresponding wrapper class, while unboxing is the reverse process. This allows for seamless integration between primitive types and objects in Java.
    // Example of using wrapper classes:

  public static void main(String[] args) {
        Integer a = 10; // Boxing
        int b = a; // Unboxing
        System.out.println("Boxed Integer: " + a);
        System.out.println("Unboxed Integer: " + b);

    }

}