package _B_Variables;

import java.util.Scanner; // class imported, which contains Scanner

public class H_NumericSystemsEntryScanner {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);  // initialize the scanner class
        System.out.println("Entry a integer number: ");
//        String StrNumber = scanner.nextLine();    // capture the answer in string data

        int decimalNumber = 0;
        try {
            decimalNumber = scanner.nextInt();  // capture the answer in int data
//            decimalNumber = Integer.parseInt(StrNumber); // parse string to int data
        } catch (Exception e){ // all exceptions derive to exception
            System.out.println("Error, You must entry a integer number!!!");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String binaryResult = "binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);

        String octalResult = "octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);

        String hexResult = "hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);

        String message = binaryResult + "\n";
        message += octalResult + "\n";
        message += hexResult;

        System.out.println(message);

        scanner.close(); // close scanner class
    }
}
