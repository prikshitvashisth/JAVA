package OOPS;

class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Car created: " + brand + "  Speed: " + speed);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 120);
        Car c2 = new Car("Honda", 100);
    }
}
