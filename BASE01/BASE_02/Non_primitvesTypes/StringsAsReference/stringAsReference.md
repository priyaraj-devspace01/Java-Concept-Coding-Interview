# Java String Immutability — Interview Notes

## 1. What is immutability?

A Java `String` is **immutable**: once a `String` object is created, its character
sequence cannot be changed.

Methods such as `concat()`, `toUpperCase()`, `replace()`, and `substring()` do **not**
modify the original string. They create and return a **new** `String` object.

```java
String s = "hello";
s.toUpperCase();

System.out.println(s); // hello — original is unchanged
```

To use the changed value, assign the returned object to a variable:

```java
String s = "hello";
s = s.toUpperCase();

System.out.println(s); // HELLO
```

Here, `"hello"` was never modified. `s` was reassigned to point to a new `"HELLO"`
object.

## 2. Why are Strings immutable?

Java made `String` immutable for these main reasons:

| Reason | Explanation |
|---|---|
| String pool / memory efficiency | Identical string literals can safely share one object, reducing memory usage. |
| Security | Strings are used in class names, file paths, URLs, database connections, and credentials. Immutability prevents accidental or malicious modification after validation. |
| Thread safety | Multiple threads can safely share the same `String` because no thread can change its contents. |
| Reliable hashing | `String` is widely used as a `HashMap` key. If a string changed after being stored, its hash code could change and the key could become unreachable. |
| Predictable behavior | A method cannot silently modify a `String` passed to it, making APIs safer and easier to reason about. |

Official Java documentation states that strings are constant and their values cannot
be changed after creation; because they are immutable, they can be shared. [Oracle Java String documentation]

## 3. String pool and literals

The **String Constant Pool** is a special area maintained by Java for string literals
and interned strings.

When you write a string literal, Java checks the pool:

- If the same value already exists, the existing pooled object is reused.
- If it does not exist, Java creates it and places it in the pool.

```java
String a = "java";
String b = "java";

System.out.println(a == b); // true
```

Both `a` and `b` point to the **same pooled** `"java"` object, so `==` returns `true`.

`==` compares **references** (whether both variables point to the same object), while
`.equals()` compares the **actual character content**.

## 4. Literal vs `new String()`

```java
String a = "java";
String b = new String("java");

System.out.println(a == b);       // false
System.out.println(a.equals(b));  // true
```

### What happens?

```java
String a = "java";
```

- Java creates/reuses `"java"` in the String Constant Pool.
- `a` refers to the pooled object.

```java
String b = new String("java");
```

- The literal `"java"` is still in the pool.
- `new String("java")` creates a **separate new object in the heap**.
- `b` refers to that separate heap object, not the pooled object.

Therefore:

```java
a == b // false — different objects
```

But their contents are the same:

```java
a.equals(b) // true
```

## 5. How `intern()` brings a string into the pool

`intern()` returns the canonical pooled string with the same content.

```java
String a = "java";
String b = new String("java");

System.out.println(a == b);           // false
System.out.println(a == b.intern()); // true
```

`b.intern()` checks whether `"java"` already exists in the pool. Since it does, it
returns the pooled reference. Therefore, `a == b.intern()` is `true`.

If the pool does not contain an equal string, `intern()` adds the string to the pool
and returns a reference to it.

## 6. Complete example

```java
public class StringImmutabilityDemo {

    public static void main(String[] args) {

        // String literals use the String Constant Pool
        String a = "java";
        String b = "java";

        System.out.println(a == b); // true — same pooled object
        System.out.println(a.equals(b)); // true — same content

        // new String creates a separate object in heap
        String c = new String("java");

        System.out.println(a == c); // false — different objects
        System.out.println(a.equals(c)); // true — same characters

        // intern() returns the pooled version
        System.out.println(a == c.intern()); // true

        // Strings are immutable
        String name = "priya";
        name.toUpperCase();

        System.out.println(name); // priya — original unchanged

        name = name.toUpperCase();

        System.out.println(name); // PRIYA — name now points to a new object

        // String concatenation creates new String objects
        String first = "Java";
        String second = "Rocks";
        String result = first + " " + second;

        System.out.println(result); // Java Rocks
    }
}
```

## 7. Immutability in memory

```text
String Constant Pool
--------------------
"java"  <---------- a
        <---------- b
        <---------- c.intern()

Heap
----
new String("java") <---------- c
```

- `a` and `b` point to the same pooled object.
- `c` points to a separate heap object created by `new`.
- `c.intern()` points back to the pooled `"java"` object.

## 8. Mutable alternatives

Use `StringBuilder` or `StringBuffer` when you need to modify text frequently.

| Class | Mutable? | Thread-safe? | When to use |
|---|---:|---:|---|
| `String` | No | Yes, because immutable | Fixed or rarely changing text |
| `StringBuilder` | Yes | No | Single-threaded string building |
| `StringBuffer` | Yes | Yes | Multi-threaded string building |

```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Rocks");

System.out.println(sb); // Java Rocks
```

`StringBuilder` modifies the same internal character storage; it does not create a new
object for every append.

## 9. Interview one-liner

> Java Strings are immutable because their value cannot be changed after creation.
> This enables safe sharing through the String Constant Pool, improves memory usage,
> provides thread safety, and makes `String` reliable as a `HashMap` key.
> String literals are pooled, while `new String()` creates a separate heap object;
> `intern()` can return the pooled reference.

## 10. Expected interview output

```java
String a = "hello";
String b = "hello";
String c = new String("hello");

System.out.println(a == b); // true
System.out.println(a == c); // false
System.out.println(a.equals(c)); // true
System.out.println(a == c.intern()); // true
```

### Why?

- `a == b` is `true` because both refer to the same pooled `"hello"` literal.
- `a == c` is `false` because `new String("hello")` creates a separate heap object.
- `a.equals(c)` is `true` because both have the same characters.
- `a == c.intern()` is `true` because `intern()` returns the pooled `"hello"` object.