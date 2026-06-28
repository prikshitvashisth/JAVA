# OOPs in Java - Complete Notes

---

# --------------------------------------------------
# Topic 1: Classes & Objects
# --------------------------------------------------

## Definition
- **Class** → Blueprint/template that defines properties and behaviors.
- **Object** → Real instance created from that class in memory.

## Real-Life Example
- Class = Blueprint of a Car (design on paper)
- Object = Actual Car built from that blueprint
- One blueprint → many cars = one class → many objects

## Why Use It?
- To model real-world entities in code
- To group related data (fields) and behavior (methods) together
- To reuse the same structure for multiple objects

## Key Rules
- Class declared using `class` keyword, object created using `new`
- One `.java` file → one `public` class (name must match filename)
- Fields get default values if not set → `int = 0`, `String = null`, `boolean = false`
- Object is created in **Heap memory**, reference variable in **Stack memory**

## Syntax
```java
class ClassName {
    dataType fieldName;
    returnType methodName() { }
}
ClassName obj = new ClassName();
obj.fieldName = value;
obj.methodName();
```

## Output of ClassesAndObjects.java
```
Brand: Toyota  Speed: 120
Brand: Honda   Speed: 100
```

## Interview Points
- Class = logical entity, Object = physical entity
- `new` keyword allocates memory and calls the constructor
- You can create unlimited objects from one class

## Common Mistakes
- Using object reference without `new` → NullPointerException
- File name ≠ public class name → compile error
- Calling non-static method without object → error

## Memory Trick
> **Class = Cookie Cutter, Object = Cookie**
> One cutter → many cookies. Same shape, different values.

---

# --------------------------------------------------
# Topic 2: Access Modifiers
# --------------------------------------------------

## Definition
- Keywords that control **who can access** a class, field, or method.
- 4 types: `public`, `private`, `protected`, `default` (no keyword)

## Real-Life Example
- `public` → A park. Anyone can enter.
- `private` → Your bedroom. Only you can access.
- `protected` → Family home. Family (subclasses) + colony (same package).
- `default` → Colony gate. Only people inside colony (same package).

## Why Use It?
- Protect sensitive data from outside access
- Control visibility of class members
- Core part of Encapsulation

## Types

| Modifier | Same Class | Same Package | Subclass (diff pkg) | Other Package |
|---|---|---|---|---|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

## Key Rules
- Top-level class can only be `public` or `default` (never private/protected)
- `private` fields are accessed via getters/setters
- Default access = **package-private**
- `protected` is mainly useful in inheritance across packages

## Output of AccessModifiers.java
```
5000.0
Holder: Prikshit  Bank: SBI  Type: Savings  Balance: 5000.0
```

## Interview Points
- `private` is the most restrictive, `public` is least restrictive
- Access modifiers apply to classes, fields, methods, and constructors
- `protected` members are NOT accessible in unrelated classes of other packages

## Common Mistakes
- Accessing `private` field directly from outside → compile error, use getter/setter
- Marking top-level class as `private` → not allowed
- Confusing `default` with `protected` → default has no keyword written

## Memory Trick
> 🔒🔒🔒 Private → only you
> 🔒🔒 Protected → family
> 🔒 Default → colony
> 🚪 Public → open for all

---

# --------------------------------------------------
# Topic 3: Getters & Setters
# --------------------------------------------------

## Definition
- **Getter** → A `public` method that **reads** a `private` field.
- **Setter** → A `public` method that **writes/updates** a `private` field.
- They are the bridge between private data and the outside world.

## Real-Life Example
- ATM Machine → You can't touch the cash directly (private).
- You use buttons (getter/setter) to deposit or withdraw.

## Why Use It?
- To access private fields safely from outside the class
- To add validation before setting a value
- Required for Encapsulation to work properly

## Key Rules
- Getter → `public returnType getFieldName()`
- Setter → `public void setFieldName(dataType param)`
- By convention: field `name` → getter `getName()`, setter `setName()`
- Setters can have validation logic (e.g., reject negative age)

## Syntax
```java
private int age;

public int getAge() {       // getter
    return age;
}

public void setAge(int age) {   // setter
    if (age > 0) this.age = age;
}
```

## Output of GettersAndSetters.java
```
Name: Prikshit
Age: 21
Updated Age: 25
Invalid age rejected.
```

## Interview Points
- Getters/Setters enable **controlled access** to private data
- `this.fieldName` inside setter differentiates field from parameter
- IDEs can auto-generate them (right-click → Generate → Getter/Setter)
- Read-only field → only getter, no setter

## Common Mistakes
- Writing getter with `void` return type → should return the field type
- Forgetting `this.` in setter when param name = field name → assigns to itself
- Writing setter that returns a value → should be `void`

## Memory Trick
> **Get = Read, Set = Write**
> Like a locker: Set puts it in, Get takes it out.

---

# --------------------------------------------------
# Topic 4: Encapsulation
# --------------------------------------------------

## Definition
- Wrapping **data (fields)** and **methods** together in a class, and **hiding the data** from direct outside access.
- Achieved by making fields `private` and providing `public` getters/setters.

## Real-Life Example
- A **Capsule (medicine)** → ingredients are hidden inside. You take the capsule, not raw chemicals.
- A **TV remote** → internal wiring is hidden. You use buttons (methods) to control it.

## Why Use It?
- Protects data from accidental modification
- Makes code more maintainable and secure
- Allows validation before data is changed

## Key Rules
- Fields → always `private`
- Access via `public` getters/setters only
- Encapsulation = Data Hiding + Getter/Setter
- A fully encapsulated class is also called a **POJO** (Plain Old Java Object) or **JavaBean**

## Syntax
```java
class Person {
    private String name;    // hidden
    private int age;        // hidden

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { if(age > 0) this.age = age; }
}
```

## Output of Encapsulation.java
```
Name: Prikshit  Age: 21
Age after invalid input: 21
```

## Interview Points
- Encapsulation is one of the 4 pillars of OOPs
- Makes a class a **black box** → outside code doesn't need to know internals
- Encapsulation ≠ Abstraction (common confusion — see below)

## Difference: Encapsulation vs Abstraction

| Encapsulation | Abstraction |
|---|---|
| Hides **data** | Hides **implementation** |
| Uses private fields + getters/setters | Uses abstract classes / interfaces |
| HOW data is protected | WHAT is shown to the user |

## Common Mistakes
- Making fields `public` and calling it encapsulation → wrong, fields must be `private`
- Confusing with Abstraction → Encapsulation = data hiding, Abstraction = implementation hiding

## Memory Trick
> **Encapsulation = Capsule**
> Data is packed inside, only safe doors (getters/setters) let you in.

---

# --------------------------------------------------
# Topic 5: Constructors
# --------------------------------------------------

## Definition
- A special method that is **automatically called when an object is created**.
- Used to **initialize** the object's fields at the time of creation.

## Real-Life Example
- When you **buy a new phone**, it comes pre-configured with a default language, brightness, etc.
- Constructor = that initial setup that runs the moment the phone is turned on.

## Why Use It?
- To set initial values to fields when object is created
- Avoids writing separate setter calls for every field
- Ensures object is ready to use immediately after creation

## Key Rules
- Constructor name = class name (exactly)
- No return type (not even `void`)
- Called automatically with `new`
- If you don't write one, Java provides a **default constructor** (no-arg, does nothing)
- Once you write any constructor, Java's default constructor is removed

## Types (covered in next topic in detail)
- Default Constructor
- No-arg Constructor
- Parameterized Constructor
- Copy Constructor

## Syntax
```java
class Car {
    String brand;

    Car(String brand) {         // constructor
        this.brand = brand;
    }
}
Car c = new Car("Toyota");      // constructor called automatically
```

## Output of Constructors.java
```
Car created: Toyota  Speed: 120
Car created: Honda   Speed: 100
```

## Interview Points
- Constructor is NOT inherited by subclass
- Constructor can be overloaded (multiple constructors with different params)
- `this()` can call another constructor in the same class (constructor chaining)
- Constructors can have access modifiers

## Common Mistakes
- Giving return type to constructor → it becomes a regular method, not a constructor
- Constructor name ≠ class name → compile error
- Forgetting `this.` when param name = field name

## Memory Trick
> **Constructor = Birth Certificate**
> When an object is born (created), constructor runs and fills in the details.

---

# --------------------------------------------------
# Topic 6: Types of Constructors
# --------------------------------------------------

## Definition
Java has 3 main types of constructors:
1. **Default Constructor** → provided by Java if no constructor is written (no-arg, empty body)
2. **No-arg Constructor** → written by programmer, no parameters, can have logic
3. **Parameterized Constructor** → takes parameters to initialize fields with custom values

## Real-Life Example
- Default → A blank form given to you (Java fills it in empty)
- No-arg → You create a blank form with some pre-filled defaults
- Parameterized → You fill in the form with your own values at the time of creation

## Key Rules
- If you write any constructor, Java removes the default constructor
- You can have multiple constructors in one class (overloading)
- `this()` must be the **first statement** in a constructor to call another constructor

## Syntax
```java
class Student {
    String name;
    int age;

    Student() {                          // no-arg constructor
        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {      // parameterized constructor
        this.name = name;
        this.age = age;
    }
}
```

## Output of TypesOfConstructors.java
```
Default setup → Name: Unknown  Age: 0
Custom setup  → Name: Prikshit  Age: 21
```

## Interview Points
- Default constructor is **implicitly** provided only when no constructor exists
- Constructor overloading = multiple constructors with different parameter lists
- `this()` call for constructor chaining must be first line

## Common Mistakes
- Writing a constructor after having written a parameterized one and expecting default to still exist → it won't
- Using `this()` anywhere other than first line → compile error

## Memory Trick
> **No-arg = blank form, Parameterized = pre-filled form**

---

# --------------------------------------------------
# Topic 7: Copy Constructor
# --------------------------------------------------

## Definition
- A constructor that creates a **new object as a copy of an existing object**.
- Takes an object of the same class as parameter and copies its field values.

## Real-Life Example
- **Photocopier** → You put in a document, you get an identical copy. Original is unchanged.

## Why Use It?
- To duplicate an object without affecting the original
- Useful when you want two separate objects with same data

## Key Rules
- Java does NOT provide a copy constructor automatically (unlike C++)
- You must write it manually
- It creates a **new, independent object** (not the same reference)

## Syntax
```java
class Student {
    String name;
    int age;

    Student(Student s) {       // copy constructor
        this.name = s.name;
        this.age = s.age;
    }
}
Student s1 = new Student("Prikshit", 21);
Student s2 = new Student(s1);   // copy of s1
```

## Output of CopyConstructor.java
```
Original → Name: Prikshit  Age: 21
Copy     → Name: Prikshit  Age: 21
After change → Original: Prikshit  Copy: Ravi
```

## Interview Points
- Copy constructor creates a **new object**, not just a new reference
- `s2 = s1` does NOT copy → both point to same object
- Copy constructor vs `clone()` → copy constructor is simpler and more controlled

## Common Mistakes
- Doing `Student s2 = s1` thinking it copies → it only copies the reference, not the object
- Forgetting to copy all fields → partial copy leads to bugs

## Memory Trick
> **Copy Constructor = Photocopy Machine**
> New paper, same content. Edit one, other stays same.

---

# --------------------------------------------------
# Topic 8: Shallow Copy & Deep Copy
# --------------------------------------------------

## Definition
- **Shallow Copy** → Copies field values. If a field is an object reference, both copies point to the **same inner object**.
- **Deep Copy** → Copies everything including creating new copies of inner objects. Fully independent.

## Real-Life Example
- Shallow → Copying a folder shortcut. Both shortcuts open the same folder. Change inside = affects both.
- Deep → Copying the entire folder contents. Fully separate. Changing one doesn't affect the other.

## Why Use It?
- Shallow copy is faster but risky (shared references)
- Deep copy is safer when inner objects must be independent

## Key Rules
- Primitive fields → same behavior in both shallow and deep copy
- Object/array fields → this is where shallow vs deep matters
- Default `clone()` does shallow copy
- Deep copy must be done manually or with serialization

## Syntax
```java
// Shallow
Address a1 = new Address("Delhi");
Student s1 = new Student("Prikshit", a1);
Student s2 = new Student(s1);       // s2.address points to SAME a1

// Deep
Student s3 = new Student(s1.name, new Address(s1.address.city)); // new Address object
```

## Output of ShallowAndDeepCopy.java
```
--- Shallow Copy ---
Before change: s1 city = Delhi  s2 city = Delhi
After change:  s1 city = Mumbai s2 city = Mumbai  ← both changed!

--- Deep Copy ---
Before change: s1 city = Delhi  s3 city = Delhi
After change:  s1 city = Mumbai s3 city = Delhi   ← only s1 changed
```

## Interview Points
- Shallow copy is what `=` assignment and default `clone()` do
- Deep copy requires manual effort or libraries like Gson/Jackson
- Immutable objects (like String) are safe in shallow copy

## Difference Table

| | Shallow Copy | Deep Copy |
|---|---|---|
| Primitive fields | Copied by value | Copied by value |
| Object fields | Same reference shared | New object created |
| Independent? | ❌ Partially | ✅ Fully |
| Speed | Faster | Slower |

## Memory Trick
> **Shallow = Photocopy of a MAP (same roads)**
> **Deep = Build an entirely NEW city**

---

# --------------------------------------------------
# Topic 9: Destructors (in Java context → Garbage Collection)
# --------------------------------------------------

## Definition
- **Destructor** → In C++, it's a method that runs when an object is destroyed.
- **Java has NO destructor.** Instead, Java uses **Garbage Collector (GC)** to automatically free memory of unreferenced objects.
- Java had `finalize()` method (deprecated since Java 9) that ran before GC collected the object.

## Real-Life Example
- Hotel room → When you check out (object no longer used), housekeeping (GC) automatically cleans the room (frees memory). You don't clean it yourself.

## Why Use It?
- Java manages memory automatically → no need to manually destroy objects
- GC runs in background and frees heap memory of objects with no references

## Key Rules
- Java GC is automatic. You cannot force it (calling `System.gc()` is just a hint, not guaranteed)
- An object becomes eligible for GC when no reference points to it
- `finalize()` is **deprecated** in Java 9+ → avoid using it
- Use `try-with-resources` or `close()` for resource cleanup instead

## How Object Becomes Eligible for GC
```java
Car c = new Car();   // object created
c = null;            // reference removed → object eligible for GC
```

## Output of GarbageCollection.java
```
Object created.
Reference removed. Object eligible for GC.
Requesting GC (not guaranteed to run immediately).
```

## Interview Points
- Java uses **Mark and Sweep** algorithm for GC
- GC runs on the **Heap** memory
- You cannot predict WHEN exactly GC will run
- Strong → Soft → Weak → Phantom references affect GC behavior

## Common Mistakes
- Thinking `System.gc()` immediately destroys objects → it's just a suggestion to JVM
- Using `finalize()` for critical cleanup → unreliable, use `AutoCloseable` instead

## Memory Trick
> **GC = Automatic Garbage Truck**
> When nobody holds a reference (nobody needs the trash), the truck comes and clears it.

---

# --------------------------------------------------
# Topic 10: Inheritance
# --------------------------------------------------

## Definition
- A mechanism where a **child class (subclass)** acquires properties and methods of a **parent class (superclass)**.
- Promotes code reuse.

## Real-Life Example
- Child inherits traits from parents (eye color, height).
- In Java: `Dog` class inherits from `Animal` class → Dog gets eat(), sleep() from Animal, and adds bark() itself.

## Why Use It?
- Avoids rewriting common code in every class
- Establishes an **IS-A relationship** (Dog IS-A Animal)
- Enables polymorphism

## Key Rules
- `extends` keyword is used
- Java supports **single inheritance** only (one parent per class)
- Multiple inheritance via classes is NOT allowed in Java (only via interfaces)
- `private` members of parent are NOT inherited
- Constructor is NOT inherited, but parent constructor can be called with `super()`

## Syntax
```java
class Animal {
    void eat() { System.out.println("Eating"); }
}

class Dog extends Animal {      // Dog inherits Animal
    void bark() { System.out.println("Barking"); }
}

Dog d = new Dog();
d.eat();    // inherited from Animal
d.bark();   // Dog's own method
```

## Types (next topics)
- Single Inheritance
- Multi-level Inheritance
- Hierarchical Inheritance
- Hybrid Inheritance

## Output of Inheritance.java
```
Animal is eating.
Dog is barking.
Animal is eating.   ← inherited by Dog
```

## Interview Points
- Java does NOT support multiple inheritance with classes → avoids **Diamond Problem**
- `super` keyword accesses parent class members and constructor
- All classes in Java implicitly extend `Object` class
- IS-A relationship is checked using `instanceof`

## Common Mistakes
- Trying to extend multiple classes → compile error
- Forgetting `super()` when parent has parameterized constructor → compile error
- Accessing `private` parent fields directly in child → not allowed, use getters

## Memory Trick
> **Inheritance = Child gets parent's property**
> Dog extends Animal → Dog IS-A Animal.

---

# --------------------------------------------------
# Topic 11: Single Level Inheritance
# --------------------------------------------------

## Definition
- One child class directly inherits from one parent class.
- Simplest form of inheritance.

## Syntax
```java
class Parent { }
class Child extends Parent { }
```

## Output of SingleLevelInheritance.java
```
Vehicle is starting.
Car is driving.
```

## Memory Trick
> **A → B** (one straight line)

---

# --------------------------------------------------
# Topic 12: Multi Level Inheritance
# --------------------------------------------------

## Definition
- A chain of inheritance: Class B extends A, Class C extends B.
- C inherits from both A and B (through the chain).

## Real-Life Example
- GrandParent → Parent → Child

## Syntax
```java
class A { }
class B extends A { }
class C extends B { }    // C has access to A and B members
```

## Output of MultiLevelInheritance.java
```
Animal eating.
Dog barking.
Puppy playing.
```

## Key Rules
- `super` in C refers to B, not A directly
- Chain can be as long as needed but deep chains reduce readability

## Memory Trick
> **A → B → C** (chain, like generations)

---

# --------------------------------------------------
# Topic 13: Hierarchical Inheritance
# --------------------------------------------------

## Definition
- One parent class is inherited by **multiple child classes**.

## Real-Life Example
- Animal → Dog, Cat, Bird (all inherit from Animal)

## Syntax
```java
class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }
class Bird extends Animal { }
```

## Output of HierarchicalInheritance.java
```
Animal eating.
Dog barking.
Animal eating.
Cat meowing.
```

## Memory Trick
> **One parent, many children** → Tree structure from one root.

---

# --------------------------------------------------
# Topic 14: Hybrid Inheritance
# --------------------------------------------------

## Definition
- Combination of two or more types of inheritance.
- Example: Hierarchical + Multi-level together.
- Java does NOT support hybrid inheritance through classes (to avoid Diamond Problem).
- Achieved using **Interfaces** in Java.

## Real-Life Example
- A `FlyingFish` that is both a `Fish` and a `Bird` → multiple parents → Java solves with interfaces.

## Diamond Problem
```
       A
      / \
     B   C
      \ /
       D        ← D inherits from both B and C → which A's method to use? AMBIGUOUS
```
Java avoids this by not allowing multiple class inheritance.

## Syntax (via interfaces)
```java
interface Flyable { void fly(); }
interface Swimmable { void swim(); }

class Duck implements Flyable, Swimmable {
    public void fly() { System.out.println("Duck flying"); }
    public void swim() { System.out.println("Duck swimming"); }
}
```

## Memory Trick
> **Hybrid = Mix. Java solves it with Interfaces.**

---

# --------------------------------------------------
# Topic 15: Polymorphism
# --------------------------------------------------

## Definition
- **Poly** = many, **Morph** = forms → One entity behaving in **many ways**.
- In Java: same method name behaves differently based on context.

## Real-Life Example
- A person IS a son at home, an employee at work, a customer at a shop.
- Same person, different roles → Polymorphism.

## Why Use It?
- Write flexible and reusable code
- One interface, multiple implementations

## Types
1. **Compile-time Polymorphism** → Method Overloading (resolved at compile time)
2. **Runtime Polymorphism** → Method Overriding (resolved at runtime via dynamic dispatch)

## Key Rules
- Overloading = same method name, different parameters, same class
- Overriding = same method name, same parameters, different class (parent-child)
- Runtime polymorphism requires inheritance + overriding + parent reference to child object

## Syntax
```java
// Runtime Polymorphism
Animal a = new Dog();    // parent reference, child object
a.sound();               // calls Dog's sound() at runtime
```

## Output of Polymorphism.java
```
Compile-time: Sum = 5
Compile-time: Sum = 5.5
Runtime: Dog barks
Runtime: Cat meows
```

## Interview Points
- Method overloading = **static/compile-time** polymorphism
- Method overriding = **dynamic/runtime** polymorphism
- `final` methods cannot be overridden
- Constructor cannot be overridden

## Memory Trick
> **One name, many behaviors.**
> Like `+` operator → adds numbers, concatenates strings.

---

# --------------------------------------------------
# Topic 16: Method Overloading
# --------------------------------------------------

## Definition
- Same method name in the **same class** with **different parameter list** (type, number, or order).
- Resolved at **compile time**.

## Real-Life Example
- A calculator's `add` button works for 2 numbers, 3 numbers, decimals → same button, different inputs.

## Key Rules
- Parameters must differ (type, count, or order)
- Return type alone CANNOT differentiate overloaded methods
- Access modifier can differ
- `static` methods can also be overloaded

## Syntax
```java
class Calc {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}
```

## Output of MethodOverloading.java
```
Int sum: 5
Double sum: 5.5
Three int sum: 9
```

## Interview Points
- Overloading is **compile-time** polymorphism
- Return type alone cannot distinguish overloaded methods
- Type promotion happens if exact match not found (int → long → double)

## Common Mistakes
- Thinking different return types = overloading → not enough, params must differ
- Confusing overloading with overriding

## Difference: Overloading vs Overriding

| | Overloading | Overriding |
|---|---|---|
| Class | Same class | Parent-Child class |
| Parameters | Must differ | Must be same |
| Resolved at | Compile time | Runtime |
| Return type | Can differ | Must be same (or covariant) |
| `@Override` | Not used | Used |

## Memory Trick
> **Overloading = Same name, different ingredients (params)**

---

# --------------------------------------------------
# Topic 17: Method Overriding
# --------------------------------------------------

## Definition
- Child class provides its **own implementation** of a method already defined in the parent class.
- Same method name, same parameters, different class.
- Resolved at **runtime**.

## Real-Life Example
- Parent says "greet people by handshake." Child decides to greet with a hug instead. Same action (greet), different behavior.

## Key Rules
- Method signature must be exactly same (name + params)
- `@Override` annotation is used (optional but recommended)
- Cannot override `final`, `static`, or `private` methods
- Access modifier of overriding method must be same or more permissive
- Return type must be same or covariant (subtype)

## Syntax
```java
class Animal {
    void sound() { System.out.println("Some sound"); }
}
class Dog extends Animal {
    @Override
    void sound() { System.out.println("Bark"); }
}
Animal a = new Dog();
a.sound();    // prints "Bark" → runtime decision
```

## Output of MethodOverriding.java
```
Some sound
Bark
Cat meows
```

## Interview Points
- Overriding enables **runtime polymorphism**
- `super.methodName()` calls parent version from child
- `@Override` helps catch signature mismatch errors at compile time
- Static methods cannot be overridden (they are hidden, not overridden)

## Common Mistakes
- Changing parameter list in child → that's overloading, not overriding
- Trying to override `private` method → not possible (not visible to child)
- Making overriding method more restrictive (e.g., `public` → `private`) → compile error

## Memory Trick
> **Overriding = Child replaces parent's version with its own.**

---

# --------------------------------------------------
# Topic 18: Packages in Java
# --------------------------------------------------

## Definition
- A **package** is a folder/namespace that groups related classes and interfaces.
- Avoids naming conflicts between classes.

## Real-Life Example
- A library organized by sections → Science, History, Fiction.
- Package = Section. Class = Book.

## Why Use It?
- Organize large codebases
- Avoid class name conflicts (two classes named `Date` in `java.util` and `java.sql`)
- Control access with package-level visibility

## Key Rules
- Declared at top of file: `package com.company.project;`
- Built-in packages: `java.lang`, `java.util`, `java.io`, etc.
- `java.lang` is auto-imported; all others need explicit `import`
- Import syntax: `import packageName.ClassName;` or `import packageName.*;`

## Syntax
```java
package com.myapp.models;        // declare package

import java.util.ArrayList;      // import another package's class

public class Student { }
```

## Types
- **Built-in Packages** → `java.lang`, `java.util`, `java.io`, `java.sql`, etc.
- **User-defined Packages** → created by programmer

## Interview Points
- Default package = no package declaration (not recommended for large projects)
- `java.lang` contains `String`, `Math`, `System`, `Object` → auto-imported
- Fully qualified name avoids import: `java.util.ArrayList list = new java.util.ArrayList();`

## Memory Trick
> **Package = Folder. Class = File inside that folder.**

---

# --------------------------------------------------
# Topic 19: Abstraction
# --------------------------------------------------

## Definition
- Hiding **implementation details** and showing only **essential features** to the user.
- Focus on WHAT an object does, not HOW it does it.

## Real-Life Example
- Driving a car → You use steering, pedals (interface). You don't know the engine internals.
- ATM → You withdraw money. You don't know how the transaction is processed internally.

## Why Use It?
- Reduces complexity for the user
- Allows changing implementation without affecting the user
- Enforces a contract that subclasses must follow

## Ways to Achieve Abstraction
1. **Abstract Class** → 0 to 100% abstraction
2. **Interface** → 100% abstraction (traditionally)

## Key Rules
- `abstract` keyword used for abstract class and abstract methods
- Abstract class **cannot be instantiated** (no object directly)
- Abstract method → no body, must be overridden by subclass
- A class with even one abstract method must be declared abstract
- Abstract class can have both abstract and non-abstract (concrete) methods

## Syntax
```java
abstract class Shape {
    abstract void draw();          // abstract method - no body
    void display() {               // concrete method - has body
        System.out.println("Displaying shape");
    }
}
class Circle extends Shape {
    void draw() {                  // must override abstract method
        System.out.println("Drawing Circle");
    }
}
```

## Output of Abstraction.java
```
Drawing Circle
Drawing Rectangle
Displaying shape
```

## Interview Points
- Abstract class can have constructor (called via `super()` in child)
- You can have abstract class with no abstract methods (valid but unusual)
- Abstract class vs Interface is a common interview topic (see Interfaces section)

## Common Mistakes
- Creating object of abstract class → compile error
- Not overriding all abstract methods in subclass → subclass must also be abstract
- Confusing abstraction with encapsulation → abstraction hides behavior, encapsulation hides data

## Memory Trick
> **Abstraction = TV Remote**
> You press buttons (interface). Internal circuit (implementation) is hidden.

---

# --------------------------------------------------
# Topic 20: Abstract Classes
# --------------------------------------------------

## Definition
- A class declared with `abstract` keyword that **cannot be instantiated**.
- Can have abstract methods (no body) and concrete methods (with body).
- Acts as a **partial blueprint** for subclasses.

## Key Rules
- `abstract class ClassName { }`
- Can have fields, constructors, abstract & non-abstract methods
- Subclass must implement all abstract methods (or itself be abstract)
- Can have `static`, `final`, `private` methods too

## Syntax
```java
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {          // constructor in abstract class
        this.brand = brand;
    }

    abstract void fuelType();        // abstract - subclass must define

    void start() {                   // concrete - shared by all
        System.out.println(brand + " is starting.");
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String brand) { super(brand); }

    void fuelType() {
        System.out.println(brand + " uses electricity.");
    }
}
```

## Output of AbstractClasses.java
```
Tesla is starting.
Tesla uses electricity.
Toyota is starting.
Toyota uses petrol.
```

## Interview Points
- Abstract class is used when classes **share common behavior** but each has its own version of some methods
- Cannot use `abstract` and `final` together on a class (contradictory)
- Cannot use `abstract` and `static` together on a method

## Difference: Abstract Class vs Interface

| | Abstract Class | Interface |
|---|---|---|
| Instantiation | ❌ Cannot | ❌ Cannot |
| Methods | Abstract + Concrete | Abstract (default/static also allowed since Java 8) |
| Fields | Any type | `public static final` only |
| Constructor | ✅ Has constructor | ❌ No constructor |
| Extends/Implements | `extends` (single) | `implements` (multiple) |
| Use when | Partial implementation shared | Full contract with no shared state |

## Memory Trick
> **Abstract Class = Half-built house (some rooms done, some not)**
> Subclass completes the remaining rooms.

---

# --------------------------------------------------
# Topic 21: Interfaces
# --------------------------------------------------

## Definition
- A completely abstract type that defines a **contract** → a set of methods that implementing classes MUST provide.
- Since Java 8: can have `default` and `static` methods with body.
- Since Java 9: can have `private` methods.

## Real-Life Example
- **USB standard** → Any device that follows the USB interface (shape, pins, protocol) can connect.
- The interface defines the standard. Each device implements it differently.

## Why Use It?
- Achieve 100% abstraction (traditionally)
- Achieve multiple inheritance in Java
- Enforce a contract across unrelated classes

## Key Rules
- Declared with `interface` keyword
- All fields are `public static final` by default
- All methods are `public abstract` by default (before Java 8)
- `implements` keyword used by class
- A class can implement **multiple interfaces**
- An interface can `extend` another interface

## Syntax
```java
interface Drawable {
    void draw();                          // public abstract by default
}
interface Resizable {
    void resize(int factor);
}
class Circle implements Drawable, Resizable {
    public void draw() { System.out.println("Drawing circle"); }
    public void resize(int factor) { System.out.println("Resizing by " + factor); }
}
```

## Output of Interfaces.java
```
Drawing circle
Resizing by 2
Drawing rectangle
Resizing by 3
```

## Interview Points
- Interface variables are `public static final` → constants
- From Java 8: `default` methods allow adding new methods without breaking existing implementations
- Functional Interface = interface with exactly one abstract method (used in lambdas)
- `@FunctionalInterface` annotation marks it

## Common Mistakes
- Trying to create object of interface → not allowed
- Not implementing all interface methods without marking class abstract
- Forgetting `public` in implementing method → compile error (method is public in interface, can't reduce visibility)

## Memory Trick
> **Interface = Contract/Agreement**
> Sign it (implement it) and you MUST follow all its rules.

---

# --------------------------------------------------
# Topic 22: Static Keyword
# --------------------------------------------------

## Definition
- `static` means the member **belongs to the class**, not to any specific object.
- Shared across all objects of the class.

## Real-Life Example
- **School name** → Same for all students. No need to store in every student object. Store once at class level → `static`.
- **Student name** → Different per student → non-static (instance variable).

## Why Use It?
- Share data/methods across all objects without creating instances
- Utility methods that don't depend on object state (e.g., `Math.sqrt()`)
- Constants: `static final`

## What Can Be Static?
- Static variable (class variable)
- Static method
- Static block (runs once when class loads)
- Static nested class

## Key Rules
- Static method cannot access non-static (instance) members directly
- Static members accessed via class name: `ClassName.member`
- `this` and `super` cannot be used in static context
- Static block runs before `main()`, only once

## Syntax
```java
class Counter {
    static int count = 0;         // shared across all objects
    String name;

    Counter(String name) {
        this.name = name;
        count++;                  // increments shared counter
    }

    static void showCount() {     // static method
        System.out.println("Total: " + count);
    }
}
Counter.showCount();   // called without object
```

## Output of StaticKeyword.java
```
Static block runs first!
Count: 0
Count: 1
Count: 2
Total objects: 2
```

## Interview Points
- `main()` is static because JVM calls it without creating an object
- Static variables are stored in **Method Area** (not Heap)
- Static methods can be overloaded but NOT overridden (they are hidden)

## Common Mistakes
- Accessing instance variable from static method directly → compile error
- Thinking each object gets its own copy of static variable → all share one copy

## Memory Trick
> **Static = Shared property of the class, not the object.**
> Like WiFi password in an office → same for everyone, not stored per person.

---

# --------------------------------------------------
# Topic 23: Super Keyword
# --------------------------------------------------

## Definition
- `super` refers to the **parent class** object.
- Used to access parent class fields, methods, and constructor from the child class.

## Real-Life Example
- In a company, a Junior Dev can refer to and call upon the Senior Dev (parent) for help.
- `super` = calling the senior/parent.

## 3 Uses of `super`

### 1. Access parent class variable
```java
super.fieldName
```

### 2. Call parent class method
```java
super.methodName()
```

### 3. Call parent class constructor
```java
super();           // must be first statement in child constructor
super(params);
```

## Key Rules
- `super()` must be the **first statement** in child constructor
- If not written, Java implicitly calls `super()` (parent's no-arg constructor)
- If parent has only parameterized constructor, child must explicitly call `super(params)`
- Cannot use `super` in a static context

## Syntax
```java
class Animal {
    String name = "Animal";
    void sound() { System.out.println("Some sound"); }
}
class Dog extends Animal {
    String name = "Dog";
    void display() {
        System.out.println(super.name);    // accesses Animal's name
        super.sound();                      // calls Animal's sound()
    }
}
```

## Output of SuperKeyword.java
```
Parent constructor called.
Child constructor called.
Parent name: Animal
Parent sound: Some sound
Child name: Dog
```

## Interview Points
- `super()` and `this()` cannot both be first statement → only one can be first
- `super` is used to avoid ambiguity when child and parent have same field/method name
- Every constructor implicitly has `super()` as first line (if not written explicitly)

## Common Mistakes
- Writing `super()` after other statements in constructor → compile error, must be first
- Using `super` in static method → not allowed
- Forgetting `super(params)` when parent has no default constructor → compile error

## Memory Trick
> **super = Direct line to your parent**
> Use it to call parent's version when child has overridden it.