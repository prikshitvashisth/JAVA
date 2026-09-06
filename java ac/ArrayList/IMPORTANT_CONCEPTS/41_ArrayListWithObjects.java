import java.util.*;
class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name; this.marks = marks;
    }
    public String toString() { return name + " - " + marks; }
}
public class ArrayList41_ArrayListWithObjects {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Aman", 85));
        students.add(new Student("Riya", 92));
        for (Student s : students) System.out.println(s);
    }
}