package _D_Operators;

public class K_InstanceOfOperatorGenericTypes {
    public static void main(String[] args) {

//        Object and Number are generic objects

        Object text = "Creating an object of the String class... what's up!";

//        Both are the same:
        Number num = Integer.valueOf(7); // 7;
//        Number num = 7;

        Boolean b1 = text instanceof String;

        System.out.println("text is type of String = " + b1);

        b1 = text instanceof Object;
        System.out.println("text is type of Object = " + b1);

        b1 = text instanceof Integer;
        System.out.println("text is type of Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num is type of Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num is type of Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num is type of Object = " + b1);

        b1 = num instanceof Long;
        System.out.println("num is type of Long = " + b1);

        b1 = num instanceof Double;
        System.out.println("num is type of Double = " + b1);


//        Both are the same:
        Number decimal = Float.valueOf(45.54f);
//        Number decimal = 45.54f;

        b1 = decimal instanceof Double;
        System.out.println("decimal is type of Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal is type of Float = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal is type of Integer = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal is type of Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 is type of Boolean = " + b1);
    }

}
