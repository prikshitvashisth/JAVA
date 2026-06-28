package OOPS;

class Student {                              // class representing a student
    String name;                             // field for name
    int age;                                 // field for age

    Student(String name, int age) {          // parameterized constructor
        this.name = name;                    // assigns parameter to field
        this.age = age;                      // assigns parameter to field
    }

    Student(Student s) {                     // copy constructor - takes an existing object
        this.name = s.name;                  // copies name from given object
        this.age = s.age;                    // copies age from given object
    }
}

public class CopyConstructor {
    public static void main(String[] args) {

        Student s1 = new Student("Prikshit", 21);   // original object
        Student s2 = new Student(s1);                // copy of s1 using copy constructor

        System.out.println("Original → Name: " + s1.name + "  Age: " + s1.age);
        System.out.println("Copy     → Name: " + s2.name + "  Age: " + s2.age);

        s2.name = "Ravi";                            // changing copy does not affect original
        System.out.println("After change → Original: " + s1.name + "  Copy: " + s2.name);
    }
}
