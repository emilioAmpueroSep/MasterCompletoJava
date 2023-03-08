package com.eampuero.aintro.bvariables;

import javax.swing.*; // class imported, which contains JOptionPane

public class G_NumericSystemsEntryDialog {
    public static void main(String[] args) {

        String StrNumber = JOptionPane.showInputDialog(null,"Enter a integer number"); // window to input data and initialize the JOptionPane class

        int decimalNumber = 0;
        try {
            decimalNumber = Integer.parseInt(StrNumber); // convert to string to integer, if you write characters different to numbers, it will pass to catch
        } catch (Exception e){ // Exception= type exception
            JOptionPane.showMessageDialog(null,"Error, You must enter a integer number!!!");
            main(args); // comeback to execute the program
//            return;
            System.exit(0); //finish te procces of catch
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String binaryResult = "binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        System.out.println(binaryResult);

        String octalResult = "octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        System.out.println(octalResult);

        String hexResult = "hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
        System.out.println(hexResult);

        String message = binaryResult;
        message += "\n" + octalResult; // += concat, is similar to : message = message + "\n " + octalResult;
        message += "\n" + hexResult;

        JOptionPane.showMessageDialog(null, message); // it shows the last result
    }
}
