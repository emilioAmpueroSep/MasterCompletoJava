package com.eampuero.aintro.doperators;

public class D_IncrementalOperators {
    public static void main(String[] args) {

        // pre-increment
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post-increment
        i = 2;
        System.out.println("initial of i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();

        // pre-decrement
        i = 3;
        i = --i; // i = i - 1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post-decrement
        i = 4;
        j =  i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);

    }
}
