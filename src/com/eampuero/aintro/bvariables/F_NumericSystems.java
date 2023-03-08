package com.eampuero.aintro.bvariables;

public class F_NumericSystems {
    public static void main(String[] args) {

        System.out.println("=== Decimal number system ===");
        int decimalNumber = 500;
        System.out.println("decimalNumber = " + decimalNumber + "\n");

        System.out.println("=== Binary number system ===");
        System.out.println("binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber)); // Method convert to decimal number
        int binaryNumber = 0b111110100; // to convert integer to binary, it has to write "0b" at the begin of a literal
        System.out.println("binaryNumber = " + binaryNumber + "\n");

        System.out.println("=== Octal number system ===");
        System.out.println("octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber)); // Method convert to octal number
        int octalNumber = 0764; // for converting integer to octal, it has to write "0" at the begin of a literal
        System.out.println("octalNumber = " + octalNumber + "\n");

        System.out.println("=== Hexadecimal number system ===");
        System.out.println("hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber)); // Method convert to hexadecimal number
        int hexNumber = 0x1f4; // to convert integer to hexadecimal, it has to write "0x" at the begin of a literal
        System.out.println("hexNumber = " + hexNumber);
    }
}
