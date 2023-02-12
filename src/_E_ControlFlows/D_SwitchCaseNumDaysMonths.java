package _E_ControlFlows;

import java.util.Scanner;

public class D_SwitchCaseNumDaysMonths {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the month number from 1 - 12");
        int month = s.nextInt();

        int daysNumber = 0;
        System.out.println("Enter the year (YYYY)");
        int year = s.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12: // we can use in vertical or horizontal form
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
                daysNumber = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysNumber = 30;
                break;
            case 2:
                if (year % 400 == 0 || ((year % 4 == 0) && !(year % 100 == 0))) {
                    daysNumber = 29;
                } else {
                    daysNumber = 28;
                }
                break;
            default:
                daysNumber = 0;
        }

        System.out.println("daysNumber = " + daysNumber);
    }
}
