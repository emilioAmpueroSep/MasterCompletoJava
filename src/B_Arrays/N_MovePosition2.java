package B_Arrays;

import java.util.Scanner;

public class N_MovePosition2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int element, position;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) { // last position is going to have 0(empty) value by default.
            System.out.print("Enter a number:");
            a[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("New element:");
        element = sc.nextInt();

        System.out.println("Position where add element (0 - 9)");
        position = sc.nextInt();

        for (int i = a.length - 2; i >= position; i--) {
            a[i + 1] = a[i];
        }
        a[position] = element;

        System.out.println("The array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}