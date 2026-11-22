package OOPS.fourPillars;

abstract class CarSedan{
    int capacity;
    String name;


    abstract void testAirBag();
    abstract void startTurbo();
    abstract void changeLighting();
   // USER REQUIRED SPECIFICATIONS 
    /**  Here, are some actions which can be directly given to the user without providing their internal
          their internal implementation which don't even necessarily need to know to be get bomarded with so much of data 
          
       */ 
}

// only we restrict the internal implementation from our end so that user only get the necessary which only matter to them
class SedanImplmentation extends  CarSedan
{

    // now this class has the responsibility to implment the internal mechanism
    @Override 
    public void testAirBag()
    {
        System.out.println();
    }

    @Override 
    public void startTurbo()
    {
        System.out.println();
    }
    @Override 
    public void changeLighting()
    {
        System.out.println();
    }
}

public class FirstPillarAbstraction {
    public static void main(String[] args) {
      /*
      Abstraction is the process of hiding the internal implementation by only providing the essential information to the user:
       it can be achieved by using the abstract class or an interface
       */
    }
}
