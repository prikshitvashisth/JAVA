package OOPS;

class Address {                              // inner object - holds city info
    String city;                             // field for city name
    Address(String city) {                   // constructor to set city
        this.city = city;
    }
}

class Student {                              // student holds a reference to Address
    String name;                             // primitive-like field (String is immutable)
    Address address;                         // object reference field - key for shallow vs deep

    Student(String name, Address address) {  // constructor
        this.name = name;
        this.address = address;
    }

    Student shallowCopy() {                  // shallow copy - copies reference, not new Address object
        return new Student(this.name, this.address);   // same address object shared
    }

    Student deepCopy() {                     // deep copy - creates a brand new Address object
        return new Student(this.name, new Address(this.address.city));  // new independent Address
    }
}

public class ShallowAndDeepCopy {
    public static void main(String[] args) {

        Student s1 = new Student("Prikshit", new Address("Delhi")); // original student
        Student s2 = s1.shallowCopy();       // s2 shares the same Address object as s1

        System.out.println("--- Shallow Copy ---");
        System.out.println("Before: s1=" + s1.address.city + "  s2=" + s2.address.city);
        s1.address.city = "Mumbai";          // changing s1's city also affects s2 (shared reference)
        System.out.println("After:  s1=" + s1.address.city + "  s2=" + s2.address.city);

        s1.address.city = "Delhi";           // reset for deep copy demo
        Student s3 = s1.deepCopy();          // s3 has its own separate Address object

        System.out.println("--- Deep Copy ---");
        System.out.println("Before: s1=" + s1.address.city + "  s3=" + s3.address.city);
        s1.address.city = "Mumbai";          // changing s1's city does NOT affect s3
        System.out.println("After:  s1=" + s1.address.city + "  s3=" + s3.address.city);
    }
}
