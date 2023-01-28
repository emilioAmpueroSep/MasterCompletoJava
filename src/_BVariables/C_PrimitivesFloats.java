package _BVariables;

public class C_PrimitivesFloats {
    
    // static float varOutMethod; // it hasnt value assinged, it will be 0.0
    static float varOutMethod = 45.2F; // with value assinged
    
    public static void main(String[] args) {
//        the floatings, are used for save more than a quantity of numbers because of use of comma or point.
//        los flotantes, doubles se usan para almacenar mas cantidad de numeros debido al uso de la coma o punto.

//        by default, float variables are type double, so we have to put "F" at the end of the literal.

        float realFloat = 1.0F; // its the same that: float realFloat = 1;
        System.out.println("realFloat = " + realFloat);

//        both are the same exponential "e" equals 10 and is raised to the 4th, move the comma 3 spaces to the right
        float realFloat2 = 2.12e3F;//2.120F; // ambos son lo mismo exponencial "e" equivale a 10 y esta elevado a la 4, corre la coma 3 espacios a la derecha
        System.out.println("realFloat2 = " + realFloat2);

        float realFloat3 = 1.5e4F;//15000F; // we multuply 1.5 x 10 raised to 4 // multiplicamos 1.5 x 10 elevado a la 4
        System.out.println("realFloat3 = " + realFloat3);

        float realFloat4 = 1.5e-10F;//000000000015F; // it compacts into this scientific notation  // se compacta en esta notacion cientifica
        System.out.println("realFloat4 = " + realFloat4 + "\n");

    // if it possitive, the comma is shifted to the right; if it negative is shifted to the left;

        System.out.println("=======================================================\n");

        float realFloat5 = 000000000015F;
        System.out.println("realFloat5 = " + realFloat5);
        System.out.println("float corresponds to byte = " + Float.BYTES);
        System.out.println("float corresponds to bites = " + Float.SIZE);
        System.out.println("value maximum of a float: = " + Float.MAX_VALUE);
        System.out.println("value maximum of a float: = " + Float.MIN_VALUE + "\n");
        System.out.println("=======================================================\n");

        double realDouble = 3.4028235E39D;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponds to byte = " + Double.BYTES);
        System.out.println("double corresponds to bites = " + Double.SIZE);
        System.out.println("value maximum of a double: = " + Double.MAX_VALUE);
        System.out.println("value maximum of a double: = " + Double.MIN_VALUE + "\n");
        System.out.println("=======================================================\n");
        
        float varFloat = 3.1416F;
        System.out.println("varFloat = " + varFloat);
        
        // Always by default the primitives data has value 0 and reals data 0.0.
        // (It does not apply if value has not been assigned inside main method)

        System.out.println("varOutMethod = " + varOutMethod);

    }
}
