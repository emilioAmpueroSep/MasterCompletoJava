package _B_Variables;

public class I_TypeConversion {
    public static void main(String[] args) {

        System.out.println("======Convert variable type string to int ======");
        // * we can convert all types of data float, double, long , etc.

        String StrNumber = "50";
        
        int numeroInt = Integer.parseInt(StrNumber);
        System.out.println("numeroInt = " + numeroInt);
        
        String StrReal = "98765.43e-3"; // even convert exponents
        double doubleReal = Double.parseDouble(StrReal);
        System.out.println("doubleReal = " + doubleReal);
        
        String StrLogic = "true"; // TRUE, TruE all it's Ok
        boolean booleanLogic = Boolean.parseBoolean(StrLogic);
        System.out.println("booleanLogic = " + booleanLogic);


        System.out.println("\n======Convert variable type int to string======");

        int anotherIntNumber = 100;
        System.out.println("anotherIntNumber = " + anotherIntNumber);

        // wrapper class
        String anotherStrNumber = Integer.toString(anotherIntNumber);
        System.out.println("anotherStrNumber = " + anotherStrNumber);

        anotherStrNumber = String.valueOf(anotherIntNumber+10);
        System.out.println("anotherStrNumber = " + anotherStrNumber);
//        it is to concat it, not sum literals:
//        String anotherStrNumber2 = String.valueOf(StrNumber+10);
//        System.out.println("anotherStrNumber2 = " + anotherStrNumber2);

        double anotherDoubleReal = 1.23456;
//        double anotherDoubleReal = 1.23456e2;
        String anotherStrReal = Double.toString(anotherDoubleReal);
        System.out.println("anotherStrReal = " + anotherStrReal);

        anotherStrReal = String.valueOf(1.23456f);
//        anotherDoubleReal = 1.23456e2f;
        System.out.println("anotherStrReal = " + anotherStrReal);


        System.out.println("\n====== (CASTING) Conversion among primitives data ======");

        /*
        we can cast types data, but we have to be careful with lost of data, in terms lack of space
        in memory a type of data (ambiguous data). Recommend to change since int to long, char to short, etc. not int to short, long to int, short to char, etc.
        */

        // Primitives can be change between other primitives data or floats data, but not to string or boolean.

        int i = 22768;
//        int i = 32768; // problems, because it will be ambiguous data
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
        
    }
}
