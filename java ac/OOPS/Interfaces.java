package OOPS;

interface Drawable {                         // interface 1 - defines drawing contract
    void draw();                             // public abstract by default
}

interface Resizable {                        // interface 2 - defines resizing contract
    void resize(int factor);                 // public abstract by default
}

class Circle implements Drawable, Resizable {    // Circle follows both contracts
    public void draw() {                         // implementing Drawable's method
        System.out.println("Drawing circle");
    }
    public void resize(int factor) {             // implementing Resizable's method
        System.out.println("Resizing circle by " + factor);
    }
}

class Rectangle implements Drawable, Resizable { // Rectangle also follows both contracts
    public void draw() {
        System.out.println("Drawing rectangle");
    }
    public void resize(int factor) {
        System.out.println("Resizing rectangle by " + factor);
    }
}

public class Interfaces {
    public static void main(String[] args) {

        Circle c = new Circle();             // Circle object
        c.draw();                            // calls Circle's draw()
        c.resize(2);                         // calls Circle's resize()

        Rectangle r = new Rectangle();       // Rectangle object
        r.draw();
        r.resize(3);
    }
}