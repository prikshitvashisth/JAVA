package OOPS;

class Calculator {                           // used to show compile-time polymorphism
    int add(int a, int b) {                  // method 1 - adds two integers
        return a + b;
    }
    double add(double a, double b) {         // method 2 - same name, different param types
        return a + b;
    }
}

class Animal {                               // parent class for runtime polymorphism
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {                   // overrides sound()
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {                   // overrides sound()
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println("Compile-time: Sum = " + c.add(2, 3));       // calls int version
        System.out.println("Compile-time: Sum = " + c.add(2.0, 3.5));   // calls double version

        Animal a1 = new Dog();               // parent reference holding child object
        Animal a2 = new Cat();               // parent reference holding child object
        System.out.print("Runtime: "); a1.sound();   // Dog's sound() called at runtime
        System.out.print("Runtime: "); a2.sound();   // Cat's sound() called at runtime
    }
}
