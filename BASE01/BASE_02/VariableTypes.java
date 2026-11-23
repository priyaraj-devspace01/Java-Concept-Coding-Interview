package BASE01.BASE_02;

class Student {
    int age = 22 ; // these are called member variables - which will be associated with the objects
             // being created from this class
     

    static String school_address = "talcher"; // static variable - class level-> as only associated with class not to the
                                  // individual objects, only one copy will be created
    // Core meaning - one static variable exists in memory once, shared by every
    // object of that class. Objects don't get their own copy.
    /**
     * Changing it - if any object changes a static variable, the change is visible
     * through all objects and through the class name.
     * Access - use ClassName.var. Writing obj.var compiles, but it still points to
     * the same shared variable.
     * When it loads - it is created when the class loads, before any object exists.
     */

}

public class VariableTypes {
    public static void main(String[] args) {

        // IMPORTANT :)
          //# always remember that we always need to initialize the local variable before using it, as it doesn't have any default value as instance member has
         int localVar; 
        //  System.out.println(localVar); // XXXX - fail to use before intialization

        
        int a = 22;  
        // local variables - declared inside a method and scope and visibility only
        // until the function scope.
        


        Student s1 = new Student();
        Student s2 = new Student();

        // if s1 changes the value of static variable it will reflect to all the objects 
        s1.school_address = "angul";
        System.out.println("s1 address : - " + s1.school_address); // angul
        System.out.println("s2 address: - "+s2.school_address);  //angul

        // similarly for the instance variable objects changes are independent to each other
         s1.age = 23;
         System.out.println(s1.age); //23 only for this object
         System.out.println(s2.age); //22 unaffected

    }

}
