package OOPS;

class Person {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age > 0) this.age = age;
        else System.out.println("Invalid age rejected.");
    }
}

public class GettersAndSetters {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Prikshit");
        p.setAge(21);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        p.setAge(25);
        System.out.println("Updated Age: " + p.getAge());
        p.setAge(-5);
    }
}
