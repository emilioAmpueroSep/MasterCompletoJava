package _F_WrapperClasses;

public class D_WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //false
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

//      We can use "== or .equals()" to compare values of varieables; but in Integer cant do this(compare objects not values)
        System.out.println("comparing 2 boolean objects: " + (objBoolean == objBoolean2));
        System.out.println("comparing 2 boolean objects: " + (objBoolean.equals(objBoolean2)));
        System.out.println("comparing 2 boolean objects: " + (objBoolean == objBoolean3));
        System.out.println("comparing 2 boolean objects: " + (objBoolean2 == objBoolean3));

        boolean primBooleans2 = objBoolean2.booleanValue();  // explicit
//        boolean primBooleans2 = objBoolean2;  // implicit
        System.out.println("primBooleans2 = " + primBooleans2);
    }
}
