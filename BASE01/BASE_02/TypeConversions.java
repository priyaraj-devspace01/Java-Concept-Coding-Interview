package BASE01.BASE_02;
public class TypeConversions {
    public static void main(String[] args) {
        // 1) Widening or automatic type conversion : 
               byte b = 22;
               int a = b; 
                //since a is of greater size than byte we don't need to explcitly mention the type to cast it to int

        //2) Narrowing or downcasting
         int a1 = 124;
        //  byte b1 = a1;  // we need to explicitly cast it to (byte)
        byte b1 = (byte)a1;
        System.out.println(b1);

        // exception - to keep
        int a2 = 128; 
        byte b2 = (byte)a2; // even though we casted but it's beyound the bytoe signed range so now it flips to the negative to go in reverse
        System.out.println(b2); // expected ans - -128



    
        ///  Type promotion - automatic, implicit, done by the compiler when mixing types in an expression; always safe (no data loss)
        /// Promotion rules - byte/short/char → int in arithmetic; then int → long → float → double (the widest operand wins)
        /// 
        /// example : 
        byte b3 = 127;
        // byte b4 = b3+1; // now it's beyond it's limit
        // solution - type cast to byte or pick the large return type
        byte b4 = (byte) (b3+1);

        // choose greater data type
        int b5 = (b3+1);


        // case - 2: 
          /// when there is a mixed arithemetic expression. then the biggest data type should be takem
          int s = 22;
          double s2 = 444.4d;
          System.out.println(s+s2);  // it is double instead of int


         

    }
    
}
