package com.eampuero.barrays;

import java.util.Scanner;

public class L_SearchNumber {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a number: "); // asking only once
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number: "); // asking ten times
            a[i] = sc.nextInt();
        }

        System.out.println("\nEnter number for searching:");
        int num = sc.nextInt();
        int i = 0;
//        It can be used while or for to that case:
//        while (i < a.length && a[i] != num) {
//            i++;
//        }
        for (; i < a.length && a[i] != num; i++) {
        }
        if (i == a.length) {
            System.out.println("Number not found");
        } else if (a[i] == num) {
            System.out.println("Number found in position: " + i);
        }
    }
}
