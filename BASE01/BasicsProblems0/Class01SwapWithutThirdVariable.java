import java.util.Scanner;

class Class01SwapwithutThirdVariable {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, to cover the basics base - l1 ");
        swapWithoutThird(10, 20);
        secondTOhrMinSec(4200);
        checkOddEven(1);

        printOneToHundred(100);
        int sumOfN = sumOfN(10);
        System.out.println("sum of n natural numbers are. : " + sumOfN);

        printMultiplicationTable(10);
        System.out.println("the reverse of the number 12345 is. " + reverseFind(12345));

        boolean checkPrime = isPrimeIterativeOptimize(49);
        if (checkPrime) {
            System.out.println("it's a prime number . ");
        } else {
            System.out.println("It's not a prime number . ");
        }

        printPrimes(100);

        printFibNthTerm(10);

        int nthFibTerm = findFibonnacci(4);
        System.out.println(nthFibTerm);

        // printNthFibForN();

        boolean palindromeCheck = isPalindrome(121);
        if (palindromeCheck) {
            System.out.println("it's a palindrome number ");
        } else {
            System.out.println("it's not a palindromic number");
        }
        int countVowels = countVowels("Raju");
        System.out.println("the number of vowels in the word RAJA is " + countVowels);

        printPattern(5);
        printPyramidPattern(5);

        int lcm = findLCM(15, 20);
        System.out.println(lcm);
    }

    /// 1. Variabled and Types
    // PR01) swap two numbers without third variable
    public static void swapWithoutThird(int a, int b) {
        System.out.println("the value of a and b before swapping : " + a + ", " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("the value of a and b after swapping : " + a + ", " + b);
    }

    // PR-02) Temperature conversion
    public static double temInFahrenheit(double temp_in_cel) {

        return (temp_in_cel * 9.0 / 5.0) + 32;
    }

    public static double temInCelsius(double temp_in_fahr) {

        return (temp_in_fahr - 32) * 5.0 / 9.0;
    }

    // PR-3) Area of a circle
    public static double findAreCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // PR-04) Find the perimeter of the rectangle
    public static int findPerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    // PR-05) Converts seconds into the hour/minute.second
    public static void secondTOhrMinSec(int seconds) {
        int hr = seconds / 3600;
        int min = (seconds % 3600) / 60;
        int sec = seconds % 60;
        System.out.println(hr + "h " + min + "m " + sec + "s");
    }

    // PR-06)check whether even or odd
    public static void checkOddEven(int a) {
        // using bitwise operation
        if ((a & 1) == 0) {
            System.out.println("It's an even number as for every even number last bit is alawys 0");
        } else {
            System.out.println("It's an odd number ");
        }
    }

    // PR-7) find the largest of three numbers
    public static int findLarger(int a, int b, int c) {
        int largest = (a > b) ? ((a > c) ? a : c) : (b > c ? b : c);
        return largest;
    }

    // PR-08) cent->inch and vice versa
    public static double inchToCm(double inch) {
        return inch * 2.54;
    }

    public static double cmToInch(int cm) {
        return cm / 2.54;
    }

    // PR-09) Calculate the simple interest and compound interest

    public static double calc_SI(double principal, double rate, double time) {
        return (principal * time * rate) / 100.0;
    }

    public static double calc_CI(double principal, double rate, double time) {
        double amount = principal * Math.pow((1 + rate / 100.0), time);
        return amount - principal;
    }

    // PR-10) Perform a percentage calculation
    public double findMarkPercentage(double obtained, double total) {
        return (obtained / total) * 100.0;
    }

    // 2. Conditionals---
    // PR-01)
    public static String classifyTriangle(double a, double b, double c) {
        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || a == c)
            return "Isosceles";
        else
            return "Scalene";
    }

    // PR-02) Check Leap year validation
    public static String isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return "It's a leap year ";
        } else {
            return "It's not a leap year";
        }
    }

    // PR- 03)check number posetive, negative or zero
    public String checkNumberState(int num) {
        return (num > 0) ? "positive" : (num < 0) ? "negative" : "zero";
    }

    // PR-04) Check char is a vowel or consonant
    public static String checkVowel(char ch) {
        char lower = Character.toLowerCase(ch);
        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
            return "It's a vowel";
        } else {
            return "It's a consonant";
        }
    }

    // PR-05) Check valid triangle when sides are given
    public static boolean checkValidTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    // PR-06) Calculate the discount based on the user's purchase amount
    public static double calcDiscount(double boughtAmount) {
        double disc = (boughtAmount > 10000 ? 10 : boughtAmount > 5000 ? 5 : boughtAmount > 2000 ? 2 : 0);
        return boughtAmount - (boughtAmount * disc / 100.0);
    }

    // PR - 07) Calculate the BMI
    public static double calBMI(double weightInKG, double heightInCm) {
        return weightInKG / (heightInCm * heightInCm);
    }

    // 3) Looping )
    // PR-01)print numbers from 1 to 100
    public static void printOneToHundred(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // PR-02) Sum of Numbers 1 to N
    public static int sumOfN(int n) {
        int sum = 0;
        int i = 0;
        while (i < n) {
            sum += i;
            i++;
        }
        return sum;
    }

    // PR-3) Print the multiplication table until user wants
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "X" + j + " = " + (i * j));
            }
            System.out.println("=============");
        }
    }

    // PR-04) Reverse the digit of a number
    public static int reverseFind(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

    // PR-05) Check if a number is prime or not
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // for this example : if we take 36
    /*
     * factors: 1 * 36
     * 2 * 18
     * 3 * 12
     * 4 * 9
     * 6 * 6
     * 
     * if we notice for each factor pair we have one digit less that (Math.sqrt(36)
     * = 6 ). and one of them digit is greater than 6
     * so for every check we dont need to check for beyond the sqrt value, to reduce
     * the extra iterations for factors greater than 6
     * which were been cover eariler in the loop so to reduce the time a little bit,
     * we need to iterate upto sqrt(n)only
     * 
     */

    public static boolean isPrimeIterativeOptimize(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;

        }
        return true;
    }

    // PR-06 print all the prime upto n
    public static void printPrimes(int n) {
        int count = 0;
        System.out.println("list of prime numbers from 1 to " + n + "are listed below ");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }

        }
        System.out.println();

        System.out.println("the total count is : " + count);
    }

    // PR- 07) Compute the factorial of a number
    public static int findFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // PR-08) print the fibonnacci series upto n
    public static void printFibNthTerm(int n) {
        int f1 = 0;
        int f2 = 1;

        System.out.print(f1 + "," + f2 + ",");
        for (int i = 2; i <= n; i++) {
            int f3 = f1 + f2;
            System.out.print(f3 + ",");
            f1 = f2;
            f2 = f3;
        }
        System.out.println();
    }

    // find the nth fibonnacci term
    public static int findFibonnacci(int num) {
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;

        if (num <= 1) {
            return num;
        }
        for (int i = 2; i <= num; i++) {
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;

        }
        return t3;
    }

    public static void printNthFibForN() {
        System.out.println("Which fibonnacci term you want to find : ");
        int n = sc.nextInt();
        while (true) {

            System.out.println("the " + n + " th " + "fibonnacci term is :" + findFibonnacci(n));

            System.out.println("If you still want to continue Choose : Y for yes and N for no ");
            char ch = sc.next().charAt(0);
            if (ch == 'Y') {
                System.out.println("Which fibonnacci term you want to find : ");
                n = sc.nextInt();

            } else {
                break;
            }
        }
    }

    // PR-09)Check the palindromic number
    public static boolean isPalindrome(int num) {
        return num == reverseFind(num);
    }

    // PR-10) Count the vowels in a string
    public static int countVowels(String str) {
        String vowels = "aeiou";
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    // PR-11) print a right angle triangle star pattern
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // PR - 12) print the pyramid of star
    public static void printPyramidPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // PR- 13) Find the sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    // PR-14) Find the LCM
    /*
     * GCD rule - start at min(a,b), go downward, since GCD can't exceed the smaller
     * number
     * LCM rule (opposite) - start at max(a,b), go upward, since LCM can never be
     * smaller than the larger number
     */
    public static int findLCM(int a, int b) {
           int max = Math.max(a, b);
           int gcd = 1;
           int i =1;

           while(true)
           {
             max*=i;
            

             if(max % a ==0 && max %b ==0)
             {
                 gcd = max;
                 
             }
             else{
                break;
             }
           }
           return gcd;
          
       
    }

}