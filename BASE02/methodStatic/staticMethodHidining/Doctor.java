package BASE02.methodStatic.staticMethodHidining;

public class Doctor extends Person {

     // instead of overriding the static method of the parent class, we are hiding it by creating a static method with the same name in the child class
     public  static void show()
     {
            System.out.println("Doctor class show method");
     }
    
}
