package A_Intro.E_ControlFlows;

import java.util.Scanner;

public class B_If_ElseStatementNumDaysMonths {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the month number from 1 - 12");
        int months = s.nextInt();

        int daysNumber = 0;
        System.out.println("Enter the year (YYYY)");
        int anio = s.nextInt();

        if(months == 1 || months ==3 || months == 5 || months == 7 || months == 8 || months == 10 || months == 12){
            daysNumber = 31;
        } else if(months == 4 || months == 6 || months == 9 || months == 11){
            daysNumber = 30;
        } else if(months == 2){
            if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0))){
                daysNumber = 29;
            } else {
                daysNumber = 28;
            }
        }
        System.out.println("daysNumber = " + daysNumber);
    }
}
