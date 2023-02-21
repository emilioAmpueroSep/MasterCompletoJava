package _L_Arrays;

import java.util.Arrays;

public class D_ExampleArraysForInverseMutable {

    public static void reverseArray(String[] arreglo){
        int total2 = arreglo.length; // to finish to change the order at the end
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            // formule to change the order:
            String actual = arreglo[i];
            String reverse = arreglo[total-1-i];
            arreglo[i] = reverse;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {

        String[] products = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford" };

        int total = products.length;

        Arrays.sort(products);
        reverseArray(products);

//        Collections.reverse(Arrays.asList(productos)); // also we can transform data in a reverse way using Collections.reverse

        System.out.println("=== Using for ===");
        for(int i = 0; i < total; i++){
            System.out.println("To index " + i + " : " + products[i]);
        }
    }
}
