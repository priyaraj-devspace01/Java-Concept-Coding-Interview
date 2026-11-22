package OOPS.fourPillars;



// Method overriding
class CompileTimePoly 
{
    int add(int a,int b)
    {
        return a+b;
    }
    // int add(int b, int a)
    // {.                          // not allowed
    //     return b+a;
    // }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }

    float add(float a, int b)
    {
        return a+b;
    }
    // allowed as order of the types are different
    float add(int a, float b)
    {
        return a+b;
    }

    // String add(int a, int b).  // not allowed as return types doesn't matter in overloading
    // {
    //     return (String)(a+b);
    // }
}


class RunTimePolymorphism 
{
    public  void run()
    {
        System.out.println("i am running . ");
    }
}

class RuntimeClassChild extends  RunTimePolymorphism{
   public   void run()
   {
    System.out.println("i am running as child");
   }
}
/**
 * 
 * FouthPillarPolymorphism: 
 * poly - means many , morphism - means forms- means one thing can be exists in more than one forms.
 * it can be achieved by :
 * 1) method overloading (static binding, compile time binding) -> (where method having same name but differ in their arguments order, types), no return type is considered
 * 2) method overriding - when 
 */
public class FouthPillarPolymorphism {
    public static void main(String[] args) {
        
        CompileTimePoly cmp = new CompileTimePoly();
         int ans = cmp.add(11,22);
         float ans2 = cmp.add(23.0f,0);

         // now since which method to be called is decided at the compile time before the program execution
           // so it is called compile time polymorphism.

           // 2) runtime poly

        RunTimePolymorphism rp = new RunTimePolymorphism();
        RunTimePolymorphism rp2Child = new RuntimeClassChild();
                                // now here which class object to be created, is only decided at the run time
                                  // that's why it's called runtime polymorphism.

        // then accordingly which run() method will called to be decided
        rp.run();  // parent object
        rp2Child.run();  // child object


    }
    
}
