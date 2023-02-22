package A_Intro.D_Operators;

import javax.swing.*;

public class A_ArithmeticOperators {
    public static void main(String[] args) {
        
        int i = 5, j = 4;

        int sum = i + j;
        System.out.println("sum = " + sum);
//        System.out.println("i + j = " + i + j);
        System.out.println("i + j = " + (i + j)); // precedence

        int subtract = i - j;
        System.out.println("subtract = " + subtract);
        System.out.println("i - j = "+ (i - j)); // precedencia

        int multiply = i * j;
        System.out.println("multiply = " + multiply);

        int div = i / j;
        System.out.println("div = " + div); // it only shows integer results, not decimals
        float div2 = (float) i / (float) j; // it is correct
        System.out.println("div2 = " + div2);

        int remainder = i % j;
        System.out.println("remainder = " + remainder);

        remainder = 8 % 5; // its 3, because 5 x 1 = 5 and 3 to get 8.
        System.out.println("remainder = " + remainder);

        int number = Integer.parseInt(JOptionPane.showInputDialog("Entry a number"));
        if (number % 2 == 0) {
            System.out.println("even number = " + number);
        } else {
            System.out.println("odd number = " + number);
        }

    }
}
