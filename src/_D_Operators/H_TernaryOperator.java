package _D_Operators;

import java.util.Scanner;

public class H_TernaryOperator {
    public static void main(String[] args) {
        // ternary operator only brings a one value
        // put "," not "." to notes(double)
        // structure of ternary operator:
        String variable = 7 == 5 ? "if its true" : "if its false";
        System.out.println("variable = " + variable);

        String status = "";
        double average = 0.0;

        double maths = 0.0;
        double science = 0.0;
        double history = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Entry the notes of maths among 2.0 - 7.0:");
        maths = s.nextDouble();

        System.out.println("Entry the notes of science among 2.0 - 7.0:");
        science = s.nextDouble();

        System.out.println("Entry the notes of history among 2.0 - 7.0:");
        history = s.nextDouble();

        average = (maths + science + history) / 3; // precedence, because without () start with / then to left
        System.out.println("average = " + average);

        status = average >= 5.49 ? "passed": "refused";
        System.out.println("status = " + status);

       /* if(average >= 5.49){
            status = "Aprobado";
        } else {
            status = "Rechazado";
        }*/
    }
}
