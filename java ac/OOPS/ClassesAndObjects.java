package OOPS;

class Car {                          // Class declaration - blueprint of a Car
    String brand;                    // Field - stores the brand name of the car
    int speed;                       // Field - stores the speed of the car

    void displayInfo() {             // Method - defines behavior (what car can do)
        System.out.println("Brand: " + brand);   // Prints brand
        System.out.println("Speed: " + speed);   // Prints speed
    }
}

public class ClassesAndObjects {                 // Main class
    public static void main(String[] args) {     // Entry point of program

        Car car1 = new Car();        // Object 1 created from Car class
        car1.brand = "Toyota";       // Assigning value to brand field of car1
        car1.speed = 120;            // Assigning value to speed field of car1
        car1.displayInfo();          // Calling method on car1

        System.out.println("---");   // Separator line

        Car car2 = new Car();        // Object 2 created from same Car class
        car2.brand = "Honda";        // Different brand for car2
        car2.speed = 100;            // Different speed for car2
        car2.displayInfo();          // Same method, different output
    }
}