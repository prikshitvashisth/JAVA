package OOPS;

class Animal {                               // parent class with base method
    void sound() {
        System.out.println("Some sound");    // generic sound
    }
}

class Dog extends Animal {
    @Override                                // tells compiler this method overrides parent's method
    void sound() {                           // same name and params as parent - overriding
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {                           // Cat provides its own version of sound()
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();                           // calls Animal's sound()

        Animal d = new Dog();                // parent reference, child object
        d.sound();                           // Dog's sound() called at runtime (dynamic dispatch)

        Animal c = new Cat();                // parent reference, child object
        c.sound();                           // Cat's sound() called at runtime
    }
}