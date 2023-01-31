package _C_StringTypeStrings;

public class A_StringLiteralVsNewOperator {

    // String is a object not primitive data, its an array of characters considered.
    public static void main(String[] args) {
        // both are the same, but the first one has implicit new()
        String course = "Java Programming"; // the most used because is automatized.
        String course2 = new String("java programming");

        // here only it is comparing the instance not the literal(value):
        boolean isEqual = course == course2;
        System.out.println("course == course2 = " + isEqual);

        // compare the literal(value):
        isEqual = course.equals(course2);
        System.out.println("course.equals(course2) = " + isEqual);

        // compare the literal (value) but omits UpperCase:
        isEqual = course.equalsIgnoreCase(course2);
        System.out.println("course.equalsIgnoreCase(course2) = " + isEqual);

        // variables is sharing the same memory space in the system to save memory space, not create another instance.
        String course3 = "Java Programming";
        isEqual = course == course3;
        System.out.println("course == course3 = " + isEqual);
    }
}
