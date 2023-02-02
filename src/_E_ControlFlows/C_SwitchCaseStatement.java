package _E_ControlFlows;

import java.util.Scanner;

public class C_SwitchCaseStatement {
    public static void main(String[] args) {

        // It only supports char, byte, short, int, Character, Byte, Short, Integer, String oe Enum.
        // It is recommendable write "break" word because is gonna follow running the program.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of the month between 1 - 12:");
        int months = s.nextInt();
        String monthsNumber = null;

        switch(months){

            case 1:
                monthsNumber
                        = "January";
                break;
            case 2:
                monthsNumber
                        = "February";
                break;
            case 3:
                monthsNumber
                        = "March";
                break;
            case 4: // if i select 4, is gonna show 7, julio, because breaks are commented.
                monthsNumber
                        = "April";
//                break;
            case 5:
                monthsNumber
                        = "May";
//                break;
            case 6:
                monthsNumber
                        = "June";
//                break;
            case 7:
                monthsNumber
                        = "July";
                break;
            case 8:
                monthsNumber
                        = "August";
                break;
            case 9:
                monthsNumber
                        = "September";
                break;
            case 10:
                monthsNumber
                        = "October";
                break;
            case 11:
                monthsNumber
                        = "November";
                break;
            case 12:
                monthsNumber
                        = "December";
                break;
            default:
                monthsNumber = "Undefined";
        }

        System.out.println("monthsNumber" + " = " + monthsNumber
        );

        char num = 'z';

        switch(num){
            case '0':
                System.out.println("The number is zero");
                break;
            case '1':
                System.out.println("The num is one");
                break;
            case '2':
                System.out.println("The number is two");
                break;
            case '3':
                System.out.println("The number is three");
                break;
            case 'a':
                System.out.println("the character is a");
                break;
            default:
                System.out.println("Unknown number or character");
        }

        String name = "juan";

        switch(name){
            case "admin":
                System.out.println("Hello admin, welcome!");
                break;
            case "andres":
                System.out.println("Hi andres!");
                break;
            case "pepe":
                System.out.println("Hi pepe");
                break;
            default:
                System.out.println("Unknown user!");
        }
    }
}
