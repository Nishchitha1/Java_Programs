abstract class Vehicle {

    // abstract method (must be implemented)
    abstract void start();

    // normal method (already defined)
    void fuel() {
        System.out.println("Fuel is filled");
    }
}
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key ignition");
    }
}
public class Main1{
    public static void main(String[] args) {

        Car c = new Car();
        c.start();  // implemented method
        c.fuel();   // inherited method
    }
}