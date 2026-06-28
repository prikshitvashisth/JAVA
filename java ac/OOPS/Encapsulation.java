package OOPS;

class Student {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age > 0) this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Prikshit");
        s.setAge(21);
        System.out.println("Name: " + s.getName() + "  Age: " + s.getAge());
        s.setAge(-10);
        System.out.println("Age after invalid input: " + s.getAge());
    }
}