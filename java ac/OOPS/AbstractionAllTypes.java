package OOPS;

// ============================================================
// Abstraction using Abstract Class
// ============================================================

abstract class Shape {                       // abstract class - cannot create object directly
    abstract void draw();                    // abstract method - no body, subclass must implement

    void display() {                         // concrete method - shared by all subclasses
        System.out.println("Displaying shape");
    }
}

class Circle extends Shape {                 // must implement all abstract methods
    void draw() {
        System.out.println("Drawing Circle"); // Circle's own implementation
    }
}

class RectangleShape extends Shape {         // must implement all abstract methods
    void draw() {
        System.out.println("Drawing Rectangle"); // Rectangle's own implementation
    }
}

// ============================================================
// Abstraction using Abstract Class with Constructor & Fields
// ============================================================

abstract class Vehicle {                     // abstract class with constructor and fields
    String brand;                            // field shared by all vehicles

    Vehicle(String brand) {                  // constructor - called via super() in child
        this.brand = brand;
    }

    abstract void fuelType();                // each vehicle must define its own fuel type

    void start() {                           // concrete method - same for all vehicles
        System.out.println(brand + " is starting.");
    }
}

class ElectricCar extends Vehicle {          // concrete subclass
    ElectricCar(String brand) {
        super(brand);                        // calls Vehicle's constructor
    }
    void fuelType() {                        // implementing abstract method
        System.out.println(brand + " uses electricity.");
    }
}

class PetrolCar extends Vehicle {            // another concrete subclass
    PetrolCar(String brand) {
        super(brand);                        // calls Vehicle's constructor
    }
    void fuelType() {                        // implementing abstract method
        System.out.println(brand + " uses petrol.");
    }
}

// ============================================================
// Main class
// ============================================================

public class AbstractionAllTypes {
    public static void main(String[] args) {

        System.out.println("=== Abstraction via Abstract Class (basic) ===");
        Shape s1 = new Circle();             // parent reference, child object
        Shape s2 = new RectangleShape();     // parent reference, child object
        s1.draw();                           // calls Circle's draw()
        s2.draw();                           // calls Rectangle's draw()
        s1.display();                        // shared concrete method from Shape

        System.out.println("\n=== Abstraction via Abstract Class (with constructor & fields) ===");
        Vehicle v1 = new ElectricCar("Tesla");   // parent reference, child object
        Vehicle v2 = new PetrolCar("Toyota");
        v1.start(); v1.fuelType();               // start() shared, fuelType() specific
        v2.start(); v2.fuelType();
    }
}