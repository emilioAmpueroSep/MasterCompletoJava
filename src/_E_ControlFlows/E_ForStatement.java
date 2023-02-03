package _E_ControlFlows;

public class E_ForStatement {
    public static void main(String[] args) {

//         Use For loops, we have to know when something start and finish.

//        int i = 0; // global variable

        /*int i = 0 local variable */
        for (int i = 0; i <= 5; i++) { // i < 5; // print until 4
            System.out.println("i = " + i);
        }

//        System.out.println("i = " + i); // global variable // 6 //'cause sum last iteration ; i++

        // destructuring for loops (this code works)
//        int x = 0;
//        for (; ;) {
//
//            if (x >= 5) {
//                break;
//            }
//            System.out.println("x = " + x);
//
//            x++;
//        }

//        decrement:
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        // two variables in one for loops:
        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(j + " - " + i);
        }

//        odd and pair numbers:
        for (int i = 0; i <+ 10 ; i++) {
            if (i % 2 == 0) { // odd numbers
                continue;
            }
//            if (i % 2 != 0) { // pair numbers
////                (!(i % 2 == 0))
//                continue; // jump if sentence
//            }
            System.out.println("i = " + i);
        }
    }
}
