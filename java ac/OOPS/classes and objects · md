# --------------------------------------------------
# Topic 1: Classes & Objects
# --------------------------------------------------

## 1. Definition
- **Class** → A blueprint/template that defines properties and behaviors.
- **Object** → A real instance created from that class.
- Class exists in code. Object exists in memory (at runtime).

---

## 2. Real-Life Example
- **Class** = Blueprint of a Car (design on paper)
- **Object** = Actual Car manufactured from that blueprint
- You can create multiple cars from one blueprint → multiple objects from one class.

---

## 3. Why Do We Use It?
- To model real-world entities in code.
- To group related data (fields) and behavior (methods) together.
- To reuse the same structure for multiple objects.

---

## 4. Key Rules
- A class is declared using the `class` keyword.
- Object is created using the `new` keyword.
- One `.java` file → one `public` class (name must match filename).
- A class can have multiple objects.
- Fields get default values if not initialized (int → 0, String → null, boolean → false).

---

## 5. Syntax

```java
// Class declaration
class ClassName {
    // Fields (properties)
    dataType fieldName;

    // Method (behavior)
    returnType methodName() {
        // logic
    }
}

// Object creation
ClassName objectName = new ClassName();

// Accessing fields and methods
objectName.fieldName = value;
objectName.methodName();
```

---

## 6. Complete Java Program

```java
// File: ClassesAndObjects.java

class Car {                          // Class declaration - blueprint of a Car
    String brand;                    // Field - stores the brand name of the car
    int speed;                       // Field - stores the speed of the car

    void displayInfo() {             // Method - defines behavior (what car can do)
        System.out.println("Brand: " + brand);   // Prints brand
        System.out.println("Speed: " + speed);   // Prints speed
    }
}

public class ClassesAndObjects {                 // Main class
    public static void main(String[] args) {     // Entry point of program

        Car car1 = new Car();        // Object 1 created from Car class
        car1.brand = "Toyota";       // Assigning value to brand field of car1
        car1.speed = 120;            // Assigning value to speed field of car1
        car1.displayInfo();          // Calling method on car1

        System.out.println("---");   // Separator line

        Car car2 = new Car();        // Object 2 created from same Car class
        car2.brand = "Honda";        // Different brand for car2
        car2.speed = 100;            // Different speed for car2
        car2.displayInfo();          // Same method, different output
    }
}
```

---

## 7. Output

```
Brand: Toyota
Speed: 120
---
Brand: Honda
Speed: 100
```

---

## 8. Interview Points
- Class is a **logical entity**; Object is a **physical entity**.
- Object creation happens at **runtime** on the **Heap memory**.
- Reference variable (e.g., `car1`) is stored in **Stack memory**.
- You can create **unlimited objects** from one class.
- `new` keyword allocates memory and calls the constructor.

---

## 9. Common Mistakes
| Mistake | Correct Way |
|---|---|
| `Car car1;` then using `car1.brand` | Must do `car1 = new Car();` first |
| Naming the file different from public class | File name must match public class name |
| Trying to call method without object | Non-static methods need an object |

---

## 10. Difference Table

| Class | Object |
|---|---|
| Blueprint | Real instance |
| Declared once | Can be created many times |
| No memory on declaration | Memory allocated on `new` |
| Logical entity | Physical entity |
| `class Car {}` | `Car c = new Car();` |

---

## 11. Memory Trick
> **"Class is the COOKIE CUTTER, Object is the COOKIE"**
> One cutter → many cookies. Same shape, different toppings (values).