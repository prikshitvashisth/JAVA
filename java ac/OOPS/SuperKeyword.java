package OOPS;

class Animal {                               // parent class
    String name = "Animal";                  // parent field

    Animal() {                               // parent constructor
        System.out.println("Parent constructor called.");
    }

    void sound() {                           // parent method
        System.out.println("Parent sound: Some sound");
    }
}

class Dog extends Animal {                   // child class
    String name = "Dog";                     // child has same field name as parent

    Dog() {
        super();                             // explicitly calls parent constructor (first line)
        System.out.println("Child constructor called.");
    }

    void display() {
        System.out.println("Parent name: " + super.name);   // super.name accesses Animal's name
        super.sound();                                        // super.sound() calls Animal's sound()
        System.out.println("Child name: " + this.name);     // this.name accesses Dog's name
    }
}

public class SuperKeyword {
    public static void main(String[] args) {

        Dog d = new Dog();                   // parent constructor runs first, then child
        d.display();                         // shows difference between super and this
    }
}