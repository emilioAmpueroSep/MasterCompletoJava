package A_Intro.B_Variables;

public class E_PrimitivesBoolean {
    public static void main(String[] args) {

        // Used for control flows to evaluate expressions

        // Everyone are the same, but the most used is the number one:
        boolean logicData = true;
//      boolean logicData = Boolean.TRUE;
//      boolean logicData = Boolean.TRUE.booleanValue();

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);

        float f = 1.2345e2F; // 123.45  // float variables are type double by default, so we have to put "F" at the end of the literal.
        System.out.println("f = " + f);

        logicData = d > f;
        System.out.println("logicData = " + logicData);

        logicData = d < f;
        System.out.println("logicData = " + logicData);

        boolean isEqual = (3-2 == 1);
        System.out.println("isEqual = " + isEqual);

        boolean isEqual2 = (3-3 == 1);
        System.out.println("isEqual = " + isEqual2);
    }
}
