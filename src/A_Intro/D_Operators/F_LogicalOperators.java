package A_Intro.D_Operators;

public class F_LogicalOperators {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        // If it is OK the first expression of a condicional, stop to analyze the condition.
        // && more strict than ||
        // Precedence is very important to give priority when there are more than one calculate (left to right).
        // IN JAVA ALWAYS && HAS PRIORITY OVER FALSE. (&& more semantic than ||)

        boolean b1 = i == j && k < l && m == false; // true + true = true
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l; // true + true = true
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && (k < l || m == true); // true + (true) = true , k < l is true
        System.out.println("b3 = " + b3);

//        boolean b4 = i == j || (k < l && m == true); // true + (true) = true
        boolean b4 = (i == j || k < l) && m == true;  // true + (false) = true
        System.out.println("b4 = " + b4);

        boolean b5 = (true || true) && false; // true + false = false
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false; // true, begin to evaluate false && false, then left to right
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || false; // false
        System.out.println("b7 = " + b7);


    }
}
