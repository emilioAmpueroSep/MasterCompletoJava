package com.eampuero.barrays;

import java.util.Scanner;

public class H_ExampleArraysMajorNumber {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i]) ? max : i;
        }
        System.out.println("max = " + a[max]);
    }

}
