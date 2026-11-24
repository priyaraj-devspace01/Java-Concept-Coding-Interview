package BASE02.accessSpecifiers.IT;



class Role 
{

    public int ageLimit = 45;
    //1) public means can be access from anywhere, inside the class, inside the package, outside the class and package as well 

    private String profession = "IT";
    //2) private only can be access inside the class
    

    //4) default(private-protcted-public) can be access inside the class and inside the package only, not outside the package
    String state = "new delhi";

    public void showProfession()
    {
        System.out.println(profession); //private
        System.out.println(state);  // default
    }
}


class CityInformation
{
    Role r = new Role();
    public void showStateInfo()
    {
        System.out.println(r.state);
    }
}


public class InformationTechDept {
     public double  salary_default = 30000.0;
     
     protected String location = "GOA";
    public static void main(String[] args) {
         Role r = new Role();
        //   System.out.println(r.profession);  // here it is not visible

        System.out.println(r.ageLimit); //can be accessible

        CityInformation city  = new CityInformation();
        city.showStateInfo(); // default can be accessible inside the package only

        
    }
    
}
