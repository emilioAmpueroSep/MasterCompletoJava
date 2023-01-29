package _BVariables;

public class I_TypeConversion {
    public static void main(String[] args) {

        /*
        * we can convert to all type of data float, double, long , etc.
        * */

        String StrNumber = "50";
        
        int numeroInt = Integer.parseInt(StrNumber);
        System.out.println("numeroInt = " + numeroInt);
        
        String StrReal = "98765.43e-3"; // even convert exponents
        double doubleReal = Double.parseDouble(StrReal);
        System.out.println("doubleReal = " + doubleReal);
        
        String StrLogic = "true"; // TRUE, TruE all it's Ok
        boolean booleanLogic = Boolean.parseBoolean(StrLogic);
        System.out.println("booleanLogic = " + booleanLogic);
        
    }
}
