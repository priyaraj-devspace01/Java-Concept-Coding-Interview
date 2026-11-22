package OOPS.fourPillars;

class BankAccount 
{
    // Here class has the only control over it's data members and methods to access them from outside
    private int  balance;
    

    public int getBalance()
    {
        return balance;
    }

}
/**
 * 
 * SeondPillarEncapsulation :  data hiding
 * Encapsulation bundles the data members and the methods working on those data in a single unit
 * it can be achieved through making the data members as private and public methods to access and modification
 * 
 * benifit : 
 * i) better access control and security
 */
public class SeondPillarEncapsulation {
    public static void main(String[] args) {
          // now here from outside of BankAccount if we want make some changes
          // it's only being controlled by the BankAccount class 


          // example : private data members can't be directly accessed but using the public getter 
          // we can only be access those data 

          BankAccount account1 = new BankAccount();
        //   System.out.println(account1.balance); // direct access is not allowed as restricted by thw owner of this data member. -BankAccount Class with private specifier mark
          System.out.println(account1.getBalance());
    } 
    
}
