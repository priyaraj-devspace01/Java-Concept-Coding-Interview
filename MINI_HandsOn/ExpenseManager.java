package MINI_HandsOn;

import java.util.*;

class Expense {

    private String exp_name;
    private double amount;

    public Expense(String exp_name, double amount) {
        this.exp_name = exp_name;
        this.amount = amount;
    }

    public String getExpenseName() {
        return exp_name;
    }

    public double getExpenseAmount() {
        return amount;
    }
}

class ExpenseTracker {


    static Scanner sc = new Scanner(System.in);
    List<Expense> expenses;

    public ExpenseTracker() {
     expenses = new ArrayList<>();
    }


    public void startProcessing()
    {
        //now we need to see the menu to the user
        while (true) {
             
             showMenu();
            System.out.println("Enter one of the above option to continue [1,4] :");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter your expense name : ");
                sc.nextLine(); /// to remove the leftOver not consumed by nextInt()
                String name = sc.nextLine(); // fix-2) honest review- use nextLine() instead of next()bcz if user enters with spaces it will fail
                /**  REMEMBER ALWAYS :
                 *    * next() reads one word/token, 
                 *          while nextLine() reads the entire line including spaces.
                 *              For expense names such as Movie ticket, use nextLine().
                 */
                System.out.println("Enter the amount you've spent : ");
                double amount = sc.nextDouble();

                addNewExpense(name, amount);
            } 
            
            else if (choice == 2) {

                if(expenses.isEmpty())
                {
                    System.out.println("There is no expenses of yours, kindly add some of your expenses . ");
                    continue;
                }
                showAllExpenses();
            } 
            
            else if (choice == 3) {
                showTotalExpense();
            } else if (choice == 4) {
                break;

            } else {
                System.out.println("Invalid input : Kindly choose only from 1 to 4 ..");
               
            }

            // check at the end

            System.out.println("Do you still want to continue : Choose - [Y,N] ");
            char ch = sc.next().charAt(0);
            if(Character.toLowerCase(ch) == 'y')
            {
                showMenu();
            }else{
                break;
            }

        }

    }

    public void showWelcome()
    {
               System.out.println("=========WELCOME FOR TRACKING YOUR EXPENSES===============");
        System.out.println("Please wait while loading  ");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print(". ");
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println();
        System.out.println("Ready to Proceed .. ");
    }
    public void showMenu()
    {
           System.out.println("+++++++++++++++++++++++++++++++++++++++++");
           System.out.println("----------MENU--------------------");
            System.out.println("1. Add a new expense .");
            System.out.println("2. Show all expenses .");
            System.out.println("3. Show total expense .");
            System.out.println("4. Exit");
            System.out.println("------------------------------------------------");

          
    }

    public void showAllExpenses() {
        System.out.println("***************************************************");
        System.out.println("your all expenses are listed below");
        for (Expense i : expenses) {
            System.out.println(i.getExpenseName() + " : " + i.getExpenseAmount());
            System.out.println(".............................");
            System.out.println("**************************************************");
        }
    }

    public void addNewExpense(String name, double amount) {
        expenses.add(new Expense(name, amount));
        System.out.println("Successfully added you expense with amount "+amount);
        System.out.println("..................................");

    }

    public void showTotalExpense() {

        double total = 0;   // fix-1) honest review - always choose the correct types 
        for (Expense i : expenses) {
            total += i.getExpenseAmount();
        }

        System.out.println("the total expense of yours : " + total);
        System.out.println("......................................");
    }


    public void start()
    {
        showWelcome();
        startProcessing();
    }

}

class ExpenseManager {

    public static void main(String[] args) {

       ExpenseTracker expenseTrack = new ExpenseTracker();
       expenseTrack.start();
        

    }
}
