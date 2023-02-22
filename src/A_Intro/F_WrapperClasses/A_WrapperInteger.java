package A_Intro.F_WrapperClasses;

public class A_WrapperInteger {
    public static void main(String[] args) {
//      Integer to int:
//        Integer intObject =  new Integer(32768); // deprecated version 8
//        Integer intObject = Integer.valueOf(32768); // explicit way to create an object Integer type(boxing)
        Integer intObject = 32800;  // implicit way to create an object Integer type(boxing) both are the same
        int intPrimitive = 32768;
        Integer intObject2 = intPrimitive;
        System.out.println("intObject = " + intObject);

//      int to Integer:
        int num = intObject; // implicit
        System.out.println("num = " + num);
        int num2 = intObject.intValue();  // explicit
        System.out.println("num2 = " + num2);

//      String to Integer:
        String valueTVLed = "180000";
        Integer value = Integer.valueOf(valueTVLed);
        System.out.println("value = " + value);

//      Short to Integer:(not recommendable)
//        Short shortObject = 32768; // error overpassing the memory space
//        Short shortObject = -32769; // error overpassing the memory space
        Short shortObject = intObject.shortValue(); // ambiguous info, watch out!, lost of information
        System.out.println("shortObject = " + shortObject);

//        Byte to Integer:(not recommendable)
        Integer intObject3 = 128;
        Byte byteObject = intObject3.byteValue(); // lost of information
        System.out.println("byteObject = " + byteObject);

//      Long to Integer:(Recommendable)
        Integer intObject4 = 32800;
        Long longObject = intObject4.longValue(); // OK, no lost of info
        System.out.println("longObject = " + longObject);
    }
}
