package com.eampuero.barrays;

import java.util.Arrays;

public class C_ExampleArraysInverse {
    public static void main(String[] args) {

//        String[] productos = new String[7]; // array more dynamic

        // array less dynamic:
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;
/*
        // array more dynamic:
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";
 */

        Arrays.sort(productos);// shows values alphabetically

        System.out.println("=====USING FOR===========");
        for (int i = 0; i < total; i++) {
            System.out.println("to index " + i + ": " + productos[i]);
        }
        System.out.println("=====USING FOR REVERSE===========");
        for (int i = 0; i < total; i++) {
            System.out.println("to index " + (total - 1 - i) + ": " + productos[total - 1 - i]);
        }
        System.out.println("=====USING FOR REVERSE 2===========");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("to index " + i + ": " + productos[i]);
        }


    }
}
