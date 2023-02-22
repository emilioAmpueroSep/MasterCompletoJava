package A_Intro.D_Operators;

public class L_PrecedenceOperatos {
    public static void main(String[] args) {

        // priority increments-decrement / multiplication / division / sum / subtract

        int i = 14;
        int j = 8;
        int k = 20;

        double average = (i + j + k) / 3d;
//        double average = i + j + k / 3d;  // not the same
        System.out.println("average = " + average);

//        average = i + j + k / 3d * 10; // 14 + 8 + 66.6 // not the same
        average = (i + j + k) / 3d * 10; // 14 + 8 + 0.6
        System.out.println("average = " + average);

        average = --i + j++ + k / 3d * 10; // (13 + 8) + 66.6
//        average = (--i + j++) + (k / 3d * 10); // the same
        System.out.println("average = " + average);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
