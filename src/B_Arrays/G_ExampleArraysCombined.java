package B_Arrays;

import D_Poo.Automobile;

public class G_ExampleArraysCombined {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[a.length + b.length]; // b = new int[20];

        // adding 2 elements:

//        for (int i = 0; i < a.length; i++) {
//            a[i] = i + 1;
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            b[i] = (i + 1) * 5;
//        }
//
//        int aux = 0;
////        for (int i = 0; i < a.length; i++) {
//        for (int i = 0; i < 10; i++) {
//            c[aux++] = a[i]; // 0,2,4,6...
//            c[aux++] = b[i]; // 1,3,5,7...
//        }
//
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(i + ": " + c[i]);
//        }

//        for (int i = 0; i < a.length; i++) {
//            a[i] = i + 1;
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            b[i] = (i + 1) * 5;
//        }
//
//        int aux = 0;
//        for (int i = 0; i < b.length; i += 2) { // iterate 5 times, finishing in 20
//            for (int j = 0; j < 2; j++) {
//                c[aux++] = a[i + j];
//            }
//            for (int j = 0; j < 2; j++) {
//                c[aux++] = b[i + j];
//            }
//        }
//
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(i + ": " + c[i]);
//        }
// ============================================================================================

        // adding 3 elements:

        a = new int[9];
        b = new int[9]; // (multiplos)
        c = new int[18];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }

        int aux = 0;
        for (int i = 0; i < b.length; i = i + 3) { // iterate 5 times, finishing in 20
            for (int j = 0; j < 3; j++) {
                c[aux++] = a[i + j];
            }
            for (int j = 0; j < 3; j++) {
                c[aux++] = b[i + j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(i + ": " + c[i]);
        }

        // ============================================================================================

        // adding 3 elements:

//        a = new int[9];
//        b = new int[9]; // (multiplos)
//        c = new int[18];
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i + 1;
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            b[i] = (i + 1) * 5;
//        }
//
//        int aux = 0;
//        for (int i = 0; i < b.length; i += 3) {
//            for (int j = 0; j < 3; j++) {
//                c[aux++] = a[i + j];
//            }
//            for (int j = 0; j < 3; j++) {
//                c[aux++] = b[i + j];
//            }
//        }
//
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(i + ": " + c[i]);
//        }

    }
}
