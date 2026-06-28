package OOPS;

// ============================================================
// Single Level Inheritance - One parent, one child
// ============================================================

class Vehicle {                              // parent class
    void start() {                           // common method for all vehicles
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {                  // Car inherits Vehicle - single level
    void drive() {                           // Car's own method
        System.out.println("Car is driving.");
    }
}

// ============================================================
// Multi Level Inheritance - Chain: A -> B -> C
// ============================================================

class Animal {                               // grandparent class
    void eat() {
        System.out.println("Animal eating.");
    }
}

class Dog extends Animal {                   // parent - inherits from Animal
    void bark() {
        System.out.println("Dog barking.");
    }
}

class Puppy extends Dog {                    // child - inherits from Dog (and indirectly Animal)
    void play() {
        System.out.println("Puppy playing.");
    }
}

// ============================================================
// Hierarchical Inheritance - One parent, multiple children
// ============================================================

class Shape {                                // one parent class
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {                 // first child of Shape
    void drawCircle() {
        System.out.println("Drawing Circle.");
    }
}

class Rectangle extends Shape {             // second child of Shape
    void drawRectangle() {
        System.out.println("Drawing Rectangle.");
    }
}

// ============================================================
// Hybrid Inheritance - via Interfaces (classes don't support multiple inheritance)
// ============================================================

interface Flyable {                          // interface 1
    void fly();                              // abstract method
}

interface Swimmable {                        // interface 2
    void swim();                             // abstract method
}

class Bird {                                 // base class
    void eat() {
        System.out.println("Bird eating.");
    }
}

class Duck extends Bird implements Flyable, Swimmable {  // inherits class + 2 interfaces
    public void fly() {                      // implementing Flyable
        System.out.println("Duck flying.");
    }
    public void swim() {                     // implementing Swimmable
        System.out.println("Duck swimming.");
    }
}

// ============================================================
// Main class
// ============================================================

public class InheritanceAllTypes {
    public static void main(String[] args) {

        System.out.println("=== Single Level Inheritance ===");
        Car c = new Car();                   // Car gets start() from Vehicle
        c.start();                           // inherited from Vehicle
        c.drive();                           // Car's own method

        System.out.println("\n=== Multi Level Inheritance ===");
        Puppy p = new Puppy();               // Puppy has access to all three levels
        p.eat();                             // from Animal (grandparent)
        p.bark();                            // from Dog (parent)
        p.play();                            // Puppy's own method

        System.out.println("\n=== Hierarchical Inheritance ===");
        Circle ci = new Circle();            // Circle gets draw() from Shape
        ci.draw();                           // inherited from Shape
        ci.drawCircle();                     // Circle's own method

        Rectangle r = new Rectangle();       // Rectangle also gets draw() from Shape
        r.draw();                            // inherited from Shape
        r.drawRectangle();                   // Rectangle's own method

        System.out.println("\n=== Hybrid Inheritance ===");
        Duck d = new Duck();                 // Duck inherits Bird + Flyable + Swimmable
        d.eat();                             // from Bird class
        d.fly();                             // from Flyable interface
        d.swim();                            // from Swimmable interface
    }
}