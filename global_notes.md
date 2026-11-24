# Methods and types
### 1) System Defined method
### 2) User Definded Method
### 3) overloaded Methods
### 4) Overriden Methods
### 5) Static Method - 
assciated with the class, only single copy for all objects  
can be called using the class name
static methods can't access the non-static variables/members or methods
but if it's a static methods and static member we can access them directly
static methods can't be overriden


// when to declare a method as static
- Methods which don't modify the state of the object can be declared static.
- Utility method which dont use any instance variable and compute only on arguments,
 Example : factory design pattern
 ```java
 public class TemperatureConverter {
    // ✅ Good use of static: Doesn't need any object state, just converts an input
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

public class Thermostat {
    private double currentTemp; // Instance variable (state)

    // ❌ Should NOT be static: Depends on a specific thermostat's currentTemp
    public void increaseTemp(double degrees) {
        this.currentTemp += degrees;
    }
}
````



### 6) final method.
once declared final can't be overriden.
WHY?once declared can't be reimplemente by child


### 7) Abstract Method


### Varargs
Varargs (Variable Arguments) in Java allow a method to accept zero or more arguments of a specified type without requiring you to manually wrap them in an array or write multiple overloaded methods.

```java
public void printNumbers(int... numbers) {
    // Inside the method, 'numbers' is treated as an int[] array
    for (int num : numbers) {
        System.out.println(num);
    }
}


printNumbers();                // Zero arguments (passes an empty array: new int[0])
printNumbers(10);              // One argument
printNumbers(10, 20, 30, 40);  // Multiple arguments
printNumbers(new int[]{1, 2}); // An existing array
```

Key Rules to Remember

1. Only one varargs parameter per method: A method cannot have two varargs parameters (e.g., void test(int... a, String... b) is a compiler error).
2. Must be the last parameter: If a method has regular parameters alongside varargs, the varargs parameter must come last:
	• ✅ void log(String prefix, int... codes)
	• ❌ void log(int... codes, String prefix)
3. Under the hood, it's just an array: Java automatically packs the passed arguments into an array of that type (int[], String[], etc.). You cannot overload a method with both method(int... a) and method(int[] a) because they have the exact same signature after compilation.

