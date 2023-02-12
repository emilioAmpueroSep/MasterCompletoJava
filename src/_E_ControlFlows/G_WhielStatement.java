package _E_ControlFlows;

public class G_WhielStatement {
    public static void main(String[] args) {

        int i = 0;
        // In this case, doing the same for and while;but for is faster than while.
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean test = true; // change this flag to false, is gonna stop

        while (test) {
            if (i == 7) {
                test = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        test = false;
        while (test) {
            System.out.println("never runs");
        }


        // Do-While
        do {
            System.out.println("It will run once");
        } while (test);

        test = true;
        i = 0;

        do {

            if (i == 10) {
                test = false;
            }
            System.out.println("i = " + i); // show at least once
            i++;
        } while (test);
    }
}
