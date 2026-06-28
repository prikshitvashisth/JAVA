package OOPS;

class Calc {
    int add(int a, int b) {                  // version 1 - two int parameters
        return a + b;
    }
    double add(double a, double b) {         // version 2 - two double parameters (different type)
        return a + b;
    }
    int add(int a, int b, int c) {           // version 3 - three int parameters (different count)
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Calc c = new Calc();
        System.out.println("Int sum: " + c.add(2, 3));         // calls version 1
        System.out.println("Double sum: " + c.add(2.0, 3.5));  // calls version 2
        System.out.println("Three int sum: " + c.add(2, 3, 4));// calls version 3
    }
}