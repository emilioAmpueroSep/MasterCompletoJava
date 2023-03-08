package com.eampuero.barrays;

import java.util.Scanner;

public class J_ExampleArrayEvenOdd {
    public static void main(String[] args) {
        int[] a, evenNumber, oddNumber;
        int totalEvenNumber = 0, totalOddNumber = 0;
        a = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ten numbers:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // calculate the instances of even and odd numbers:
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                totalEvenNumber++;
            } else {
                totalOddNumber++;
            }
        }
        evenNumber = new int[totalEvenNumber];
        oddNumber = new int[totalOddNumber];

        // fill both arrays(even a odd numbers):
        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenNumber[j++] = a[i];
            } else {
                oddNumber[k++] = a[i];
            }
        }
        System.out.println("Even numbers");
        for (int i = 0; i < evenNumber.length; i++) {
            System.out.print(evenNumber[i] + " ");
        }

        System.out.println("\nOdd numbers");
        for (int i = 0; i < oddNumber.length; i++) {
            System.out.print(oddNumber[i] + " ");
        }
        System.out.println();

    }
}
