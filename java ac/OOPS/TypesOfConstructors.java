package OOPS;

class Student {                              // class representing a student
    String name;                             // field to store student name
    int age;                                 // field to store student age

    Student() {                              // no-arg constructor - sets default values
        name = "Unknown";                    // default name when no input given
        age = 0;                             // default age when no input given
    }

    Student(String name, int age) {          // parameterized constructor - takes custom values
        this.name = name;                    // this.name refers to field, name is the parameter
        this.age = age;                      // this.age refers to field, age is the parameter
    }
}

public class TypesOfConstructors {
    public static void main(String[] args) {

        Student s1 = new Student();          // calls no-arg constructor
        System.out.println("Default setup → Name: " + s1.name + "  Age: " + s1.age);

        Student s2 = new Student("Prikshit", 21);  // calls parameterized constructor
        System.out.println("Custom setup  → Name: " + s2.name + "  Age: " + s2.age);
    }
}