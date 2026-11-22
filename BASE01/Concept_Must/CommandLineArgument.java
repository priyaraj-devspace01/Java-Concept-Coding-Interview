package BASE01.Concept_Must; 
   
   
   // command line args to hands on   - command line args are thr arguments passed with space separated when program run via terminal
   // if the args having spaces use " " like "rahul kumar"
public class CommandLineArgument {
    
    public static void main(String[] args) {
        if(args.length == 0)
        {
            System.out.println("Please provide your arguments correctly");
        }else
        {
            for(int i = 0;i<args.length;i++)
            {
                System.out.println(args[i]+ " ");
            }
        }
    }
}
