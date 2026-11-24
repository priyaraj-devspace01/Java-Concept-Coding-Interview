package BASE01.wrappingPrimitives;

public class WrapperClass {
    public static void main(String[] args) {
        // Wrapper classes are used to convert primitive data types into objects.
        // Each primitive data type has a corresponding wrapper class:
        // int -> Integer, double -> Double, char -> Character, etc.

        // Example of using wrapper classes
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Boxing: converting primitive to wrapper

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);

        // Unboxing: converting wrapper back to primitive
        int unboxedInt = wrapperInt.intValue();
        System.out.println("Unboxed int: " + unboxedInt);

        // Autoboxing and unboxing (automatic conversion)
        Integer autoBoxedInt = primitiveInt; // Autoboxing
        int autoUnboxedInt = autoBoxedInt; // Unboxing

        System.out.println("Auto-boxed Integer: " + autoBoxedInt);
        System.out.println("Auto-unboxed int: " + autoUnboxedInt);
    }
    
}
