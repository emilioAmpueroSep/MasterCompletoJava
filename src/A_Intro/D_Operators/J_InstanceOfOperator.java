package A_Intro.D_Operators;

public class J_InstanceOfOperator {
    public static void main(String[] args) {

//        instanceof only used for Objects, not prmitives

//        Both are the same:
//        String text = new String("Creating an object of the String class... what's up!");
        String text = "Creating an object of the String class... what's up!"; // more simplified

//        Both are the same:
//        Integer num = new Integer(7);
        Integer num = 7; // more simplified

        Boolean b1 = text instanceof String;

        System.out.println("text is type of String = " + b1);

        b1 = text instanceof Object;
        System.out.println("text is type of Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num is type of Integer = " + b1);

        b1 = num instanceof Number; // integer, Number and Decimals are friends
        System.out.println("num is type of Number = " + b1);

        b1 = num instanceof Object; // objects inherit oF Object
        System.out.println("num is type of Object = " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal is type of Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 is type of Boolean = " + b1);
    }
}
