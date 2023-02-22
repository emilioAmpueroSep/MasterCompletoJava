package B_Arrays;

import java.util.Arrays;

public class B_ExampleArraysFor {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int totalNums = numeros.length;
        // to enter numbers in the array
        for (int r = 0; r < totalNums; r++) {
            numeros[r] = r*3;
        }
        // to loop an array
        for (int r = 0; r < totalNums; r++) {
            System.out.println("numbers : " + numeros[r]);
        }

        String[] productos = new String[7];
        // by default, Strings arrays has null its values if we don't adding a value
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);// shows values alphabetically

        System.out.println("=====USING FOR===========");
        int total = productos.length;
        for (int i = 0; i < total; i++) {
//        for (int i = 0; i <= total - 1; i++) {
            System.out.println("to index " + i + ": " + productos[i]);
        }

        System.out.println("=====USING FOREACH===========");
        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("=====USING WHILE===========");
        int i = 0;
        while (i < total) {
            System.out.println("to index " + i + ": " + productos[i]);
            i++;
        }

        System.out.println("=====USING DO-WHILE===========");
        int b = 0;
        do {
            System.out.println("to index " + b + ": " + productos[b]);
            b++;
        } while (b < total);

    }
}
