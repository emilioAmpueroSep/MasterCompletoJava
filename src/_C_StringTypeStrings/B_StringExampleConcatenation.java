package _C_StringTypeStrings;

public class B_StringExampleConcatenation {
    public static void main(String[] args) {

        String course = "Java Programming";
        String teacher = "Andres Guzman";

        String detail = course + " with the instructor " + teacher;
        System.out.println(detail);

        int ANumber = 10;
        int BNumber = 5;

        // precedence, () are the priority in the execution
        System.out.println(detail + ANumber + BNumber);
        System.out.println(detail + (ANumber + BNumber)); // correct
        System.out.println(ANumber + BNumber + detail);

        // concat(), here is only concat string objects, not modify (immutable), + = String builder
//        String detail2 = course.concat(" with " + teacher);
//        String detail2 = course.concat(" with ".concat(teacher));
        String detail2 = course.concat(" with ").concat(teacher);

        System.out.println("detail2 = " + detail2);

    }
}
