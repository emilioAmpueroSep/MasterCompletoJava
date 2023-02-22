package A_Intro.F_WrapperClasses;

public class C_WrapperOperationRelationals {
    public static void main(String[] args) {
//      Integer num1 = 1000;
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // compare the objects, not the values of objects:
        System.out.println("Are they the same object? " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

//      IMPORTANT: In Java, if both objects have values less than 128, the result of == is gonna be True, not false.
        // compare the objects, not the values of objects:
        System.out.println("Are they the same object? " + (num1 == num2));

        // To compare values of different objects:
        System.out.println("Do they have the same value? " + (num1.equals(num2)));
        System.out.println("Do they have the same value? " + (num1.intValue() == num2.intValue()));

//      We can use all aritmetics operators(<,>,<=,>=,+,-,,/,*,%...) in a normal form less == that it has a different use.

        num2 = 500;
        boolean condition = num1 > num2; // implicit
        System.out.println("condition = " + condition);

        boolean condition2 = num1.intValue() > num2.intValue(); // explicit
        System.out.println("condition2 = " + condition2);

    }
}
