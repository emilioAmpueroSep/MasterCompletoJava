package B_Arrays;

import java.util.Scanner;

public class I_ExampleArrayDetectOrder {
    public static void main(String[] args) {
        int[] arrNumbers = new int[7];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 numbers:");

        for (int i = 0; i < arrNumbers.length; i++) {
            arrNumbers[i] = sc.nextInt();
        }

        boolean asc = false;
        boolean desc = false;
        for (int i = 0; i < arrNumbers.length - 1; i++) { // -1 for not overflow (desbordar el array)
            if (arrNumbers[i] > arrNumbers[i + 1]) { // pos 1 is mayor than pos 2(i+1)...
                desc = true;
            }
            if (arrNumbers[i] < arrNumbers[i + 1]) {
                asc = true;
            }
        }

        if (asc && desc) { // both are true
            System.out.println("Array  = jumbled"); // desordenado
        }
        if (!asc && !desc) { // both are false
            System.out.println("Array = ordered");
        }
        if (asc && !desc) { // true and false
            System.out.println("Array = ordered in a ascendant way");
        }
        if (!asc && desc) { // false and true
            System.out.println("Array = ordered in a descendant way");
        }

    }
}

// we can do the same exercise with String instead of int but using methos ".toCompare()"
