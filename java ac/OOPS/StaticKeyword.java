package OOPS;

class Counter {
    static int count = 0;                    // static variable - shared across all objects
    String name;                             // instance variable - unique per object

    static {                                 // static block - runs once when class is loaded
        System.out.println("Static block runs first!");
        System.out.println("Count: " + count);
    }

    Counter(String name) {                   // constructor
        this.name = name;                    // sets instance variable
        count++;                             // increments shared static variable
    }

    static void showCount() {                // static method - called without object
        System.out.println("Total objects: " + count);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {

        Counter c1 = new Counter("First");   // count becomes 1
        System.out.println("Count: " + Counter.count);  // accessed via class name

        Counter c2 = new Counter("Second");  // count becomes 2
        System.out.println("Count: " + Counter.count);

        Counter.showCount();                 // static method called on class, not object
    }
}