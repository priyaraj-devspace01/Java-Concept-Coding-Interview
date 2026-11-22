package OOPS.fourPillars;

class A{
    public void hii()
    {
        System.out.println("hii");
    }
}

class B extends A{
    
}


class C extends B{

}

// Hierarchical 
class D  extends A{

}

class E extends A{

}

// here both D,E extends extends the same class A


// -------------------------------------------------------
// DIAMOND problem 
class Aa{
    public void run()
    {
        System.out.println("I am run A");
    }
}

class Bb
{
    public void run()
    {
        System.out.println("I am run B");
    }
}

// now if we have one class let's Cc who want's to inherits both Aa and Bb 
//==> IMP) 
/// class Cc extends Aa, Bb {
//     // java doesn't allow this as now  Cc at the time calling method run 
        // will confuse to think which class run() to call and it will eventually creates ambiguity on code

// }
/**
 * 
 * 
 * ThirdPillarInheritance: 
 * 
 *  1) it's the capacity of a child class to inherit the property from the parent class
 *  2) it can be achieved via using 'extends' keyword in java
 *  3) in java we have three types of inheritance exists :   
 *     i) Single inheritance ( classA -> ClassB)
 *     ii) MultiLevel Inheritance ( classA->classB->classC)
 *     iii) Hierarchical Inheritance ( class A -> classB, classC)
 * 4) as child class already inherits the props and behaviours, we don't need to further declare the same duplicated things of parent
 * 5) it helps us to achieve the polymorphism in java. 
 * 
 * there is an another type called multiple inheritance(which can only be implemented by using the abstract class or interface which solves the diamond problem due to which java doesn't include multiple inheritance )
 */
public class ThirdPillarInheritance {
    public static void main(String[] args) {
        B b = new B();
        b.hii();  // even though B doesn't have the hii method but 
                      // sinxe it inherits the property and behaviours from it's parent class A not it can access it

        
    }
    
}
