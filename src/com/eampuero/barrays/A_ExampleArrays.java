package com.eampuero.barrays;
import java.util.Arrays;// helper class o f array

public class A_ExampleArrays {
    public static void main(String[] args) {

        int[] numeros = new int[4]; // instance of an array
        // by default, int arrays has 0 or 0.0 its values if we don't adding a value
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7"); // convert to String to Integer to be showed as int
        numeros[2] = (int)35L; // I can use casting
        numeros[3] = -1;
        // numeros[4] = 5; // shows an exception, forbidden add more that capacity of arrays

        Arrays.sort(numeros); // shows values menor to mayor

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1]; // show the last one
        //int m = numeros[4]; // shows an exception

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        String[] productos = new String[7]; // instance of an array
        // by default, Strings arrays has null its values if we don't adding a value
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);// shows values alphabetically

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);
    }
}
