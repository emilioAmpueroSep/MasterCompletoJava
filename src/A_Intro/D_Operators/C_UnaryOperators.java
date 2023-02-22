package A_Intro.D_Operators;
public class C_UnaryOperators {
    public static void main(String[] args) {

        // Used for reverse the sign. (truth tables)
        // sirven para invertir el signo, solo eso

        int i = -5;

        int j = +i; // j = (1)*i => -5
        System.out.println("j = " + j);

        int k = -i; // k = (-1)*i => 5
        System.out.println("k = " + k);

        i = 6;
        j = +i;
        System.out.println("j = " + j);

        k = -i;
        System.out.println("k = " + k);


/*
        int i = -5;
        j=+(-5) ->    j=-5
        k=-(-5)     ->  k=5
*/


    }
}
