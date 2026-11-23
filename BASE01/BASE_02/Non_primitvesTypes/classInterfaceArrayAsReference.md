# Java Reference Types — Class, Interface, Array

## 1. What is a reference type?

A **reference type** variable does not directly store the object’s data.
It stores a **reference** (address) that points to an object in heap memory.

Java reference types include:

- Classes
- Interfaces
- Arrays

```java
Student s = new Student(); // s stores a reference to a Student object
```

## 2. Class as reference type

A class defines the blueprint for objects.

```java
class Student {
    String name;
}

Student s1 = new Student();
Student s2 = s1; // both refer to the same object

s1.name = "Priya";

System.out.println(s2.name); // Priya
```

`s1` and `s2` are different variables, but they point to the **same object**.

## 3. Interface as reference type

An interface is also a reference type.
An interface variable can refer to any object of a class that implements it.

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

Animal a = new Dog(); // interface reference -> Dog object
a.sound(); // Bark
```

The reference type is `Animal`, but the actual object is `Dog`.

## 4. Array as reference type

Arrays are objects in Java, so array variables also hold references.

```java
int[] arr1 = {10, 20, 30};
int[] arr2 = arr1; // both refer to the same array object

arr1 = 99;

System.out.println(arr2); // 99
```

Changing data through one reference affects the other reference because both point to
the same array.

## 5. Reference vs primitive

| Type | Stores | Examples |
|---|---|---|
| Primitive | Actual value | `int`, `double`, `char`, `boolean` |
| Reference | Address/reference to object | `String`, `Student`, `Animal`, `int[]` |

```java
int a = 10;
int b = a; // copies value 10

b = 20;

System.out.println(a); // 10 — unchanged
```

```java
int[] a = {10};
int[] b = a; // copies reference

b = 20;

System.out.println(a); // 20 — same object changed
```

## 6. `==` with reference types

`==` compares whether two reference variables point to the **same object**.

```java
String a = "java";
String b = "java";

System.out.println(a == b); // true — same pooled String object
```

```java
String c = new String("java");

System.out.println(a == c); // false — different objects
System.out.println(a.equals(c)); // true — same content
```

## 7. Interview one-liner

> In Java, classes, interfaces, and arrays are reference types. Their variables store
> references to objects in heap memory, not the objects themselves. Therefore, assigning
> one reference variable to another makes both point to the same object.