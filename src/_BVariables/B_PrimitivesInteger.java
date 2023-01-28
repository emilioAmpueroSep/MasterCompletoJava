package _BVariables;

public class B_PrimitivesInteger {
    public static void main(String[] args) {
        // Primitives are a type of data which represent a value

        // Primitives : Value
        // Reference : Objets = Instance of a Class


        byte numberByte = 127;
        System.out.println("numberByte = " + numberByte);
        System.out.println("type of byte corresponds to byte = " + Byte.BYTES);
        System.out.println("type of byte corresponds to bites = " + Byte.SIZE);
        System.out.println("value maximum of a byte: = " + Byte.MAX_VALUE);
        System.out.println("value minimum of a byte: = " + Byte.MIN_VALUE + "\n");
        System.out.println("=======================================================\n");

        short numberShort = 32767;
        System.out.println("numberShort = " + numberShort);
        System.out.println("type of short corresponds to byte a  = " + Short.BYTES);
        System.out.println("type of short corresponds to bites a  = " + Short.SIZE);
        System.out.println("value maximum of a short: = " + Short.MAX_VALUE);
        System.out.println("value minimum of a short: = " + Short.MIN_VALUE + "\n");
        System.out.println("=======================================================");

        int numberInt = 2147483647;
        System.out.println("numberInt = " + numberInt);
        System.out.println("type of int corresponds to byte a  = " + Integer.BYTES);
        System.out.println("type of int corresponds to bites a  = " + Integer.SIZE);
        System.out.println("value maximum of a int: = " + Integer.MAX_VALUE);
        System.out.println("value minimum of a int: = " + Integer.MIN_VALUE + "\n");
        System.out.println("=======================================================");

        long numberLong = 9223372036854775807L; // siempre la "L" con mayuscula para distinguirla del 1
        System.out.println("numberLong = " + numberLong);
        System.out.println("type of long corresponds to byte a  = " + Long.BYTES);
        System.out.println("type of long corresponds to bites a  = " + Long.SIZE);
        System.out.println("value maximum of a long: = " + Long.MAX_VALUE);
        System.out.println("value minimum of a long: = " + Long.MIN_VALUE + "\n");
        System.out.println("=======================================================");

        // var numberVar = 2147483647; // by default will be in type int
        // var numberVar = 9223372036854775807L; // to give value long is must be write "L" at the end of the value of the variable
        var numberVar = 9223372036854775808F; // If i want a value greater than Long, write "F" or "D" at the end of the value of the variable

    }
}
