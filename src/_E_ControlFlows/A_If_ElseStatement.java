package _E_ControlFlows;

public class A_If_ElseStatement {
    public static void main(String[] args) {

        // if it there is only one code line, i could not write { }, but is a good practice to use it.

        float average = 5.5f;

        if(average >= 6.5) {
            System.out.println("Congratulations, excellent average!");
        } else if(average >= 6.0){
            System.out.println("Very good average!");
        } else if(average >= 5.5){
            System.out.println("Good average!");
        } else if(average >= 5.0){
            System.out.println("Regular, you need to try a little harder!");
        } else if(average >= 4.0){
            System.out.println("Not enough, you need to study more!");
        } else {
            System.out.println("Reprobate!");
        }

        System.out.println("Your average is " + average);
    }
}
