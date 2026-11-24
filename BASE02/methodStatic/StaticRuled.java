package BASE02.methodStatic;



class Demo 
{
    static int val1 = 100;
    int val2 = 200;

    public void show()
    {

        // A non-static method can access both static and non-static members of the class
        System.out.println(val1);
        System.out.println(val2);
    }

    public static void showVal1(Demo d)
    {
        // A static method can access only static members of the class
        System.out.println(val1);

        // it can't able to access the val2 and show() method as they are non-static members of the class directly, so we need to create the object of the class to access them
        // System.out.println(al2);  //X
        System.out.println(d.val2); // we can access the non-static members of the class by creating the object of the class and passing it to the static method
        

        // show(); //X
        d.show(); // we can access the non-static members of the class by creating the object
    }
}
public class StaticRuled {
    
}
