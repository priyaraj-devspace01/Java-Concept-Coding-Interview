package BASE01.Concept_Must;

import java.util.*;


class SwapMembers 
{
   int val;
   SwapMembers(int val)
   {
    this.val  = val;
   }

   public static void swap(SwapMembers s1, SwapMembers s2)
   {

    // s1 = new SwapMembers(11);  // because here we re-assign the local reference to a new object which won't affect the caller objects value
    // s2 = new SwapMembers(22);


    int temp = s1.val;    // but here we are pointing to the same object by passing the reference copy to the local object reference StackOverflowError
    s1.val = s2.val;       // so any changes will also modify the caller variables value
    s2.val = temp;
   }

}


public class ReferenceAsParamDoesntAllowForReassignment {
    public static void main(String[] args) {

      SwapMembers s1 = new SwapMembers(11);
      SwapMembers s2 = new SwapMembers(22);

      System.out.println("the value of s1 and s2 before swap "+s1.val+ ","+s2.val);

     SwapMembers.swap(s1,s2);

     System.out.println("the value of s1 and s2 after swap "+s1.val+ ","+s2.val);
      
       
    }
}