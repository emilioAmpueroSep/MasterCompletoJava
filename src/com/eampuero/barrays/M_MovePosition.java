package com.eampuero.barrays;

import java.util.Scanner;

public class M_MovePosition {
    public static void main(String[] args) {

        int[] a = new int[10];
        int lastNumber;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number:");
            a[i] = sc.nextInt();
        }
        System.out.println();
        lastNumber = a[a.length - 1]; // last position of array
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i]; // a[i] value saved on array a
        }
        a[0] = lastNumber;

        System.out.println("The array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
