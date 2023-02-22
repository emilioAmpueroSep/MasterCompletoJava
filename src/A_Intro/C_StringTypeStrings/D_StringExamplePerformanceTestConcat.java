package A_Intro.C_StringTypeStrings;

public class D_StringExamplePerformanceTestConcat {
    public static void main(String[] args) {

        // StringBuilder is faster to calculate results always because optimize the creation of object and use buffer.
        /* concat() is faster than "+" when there are few values in iteration, but when there are more than 5000 approx,
        it is slower than "+" */

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long start = System.currentTimeMillis(); // time UTC

        for (int i = 0; i < 500; i++) {
//            c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 4ms,10000 => 105ms,100000 => 5071ms
//            c += a + b + "\n"; // 500 => 19ms, 1000 => 21ms, 10000 =>68ms, 100000 => 1976ms
            sb.append(a).append(b).append("\n"); // append, used for concatenating in sb
            // 500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 8ms
        }

//      garbage collector:
//      Used to recycle space in memory when there are process opened without use.
        System.gc(); // Its not necessary use it explicitly because it works implicit.

        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString()); // toString() generate complete string
        System.exit(0); // finish good form
    }
}
