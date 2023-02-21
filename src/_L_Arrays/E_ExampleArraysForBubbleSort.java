package _L_Arrays;

public class E_ExampleArraysForBubbleSort {

    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length; // to finish to change the order at the end
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            // formule to change the order:
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] products = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = products.length;

        int counter = 0;

        for (int i = 0; i < total - 1; i++) {

            for (int j = 0; j < total -1 -i; j++) {
                // doing a sort manually:
                if (products[i+1].compareTo(products[j]) < 0) {
                    String auxiliar = products[j];
                    products[i] = products[j+1];
                    products[j] = auxiliar;
                }
                counter++;
            }
        }
        System.out.println("counter = " + counter);

        System.out.println("=== Using for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("To index " + i + " : " + products[i]);
        }
    }
}
