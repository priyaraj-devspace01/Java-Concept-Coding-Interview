package BASE02.accessSpecifiers.Sales;

import BASE02.accessSpecifiers.IT.InformationTechDept;


public class SalesTeam extends InformationTechDept {

    
    public static void main(String[] args) {
        InformationTechDept tech = new InformationTechDept();
        System.out.println(tech.salary_default);
        // as public can be accsible from here as well

        SalesTeam sales = new SalesTeam();
        System.out.println(sales.location);


      

    }
    
}
