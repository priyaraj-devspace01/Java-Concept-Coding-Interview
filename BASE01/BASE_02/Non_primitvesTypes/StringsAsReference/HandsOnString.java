package BASE01.BASE_02.Non_primitvesTypes.StringsAsReference;

public class HandsOnString {
    public static void main(String[] args) {
          String str  = "hello"; //using string literal
          String str2 = new String("hello"); // using the new keyword

          String str3 = "hello";  // doesn't create a new object as "hello" object already exist inside the heap contant pool, instead of creating will assign same reference to the object "hello"

          System.out.println(str == str2); // false as both are in different heap area
          System.out.println(str2.intern() == str); // checks in pool is there any object exists in pool with content same as str = "hello"
          System.out.println(str == str3);


          // to compare the content only we can use the .equals() method
          System.out.println(str.equals(str2));
    }
    
}
