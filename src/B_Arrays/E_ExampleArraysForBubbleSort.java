package B_Arrays;

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

    public static void sortBubble(Object[] arr) {
        int total = arr.length;
        int counter = 0;

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
//                doing autoboxing
                if (((Comparable) arr[j + 1]).compareTo(arr[j]) > 0) {
                    Object auxiliar = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = auxiliar;
                }
                counter++;
            }
        }
        System.out.println("counter = " + counter);
    }

    public static void main(String[] args) {

        String[] products = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = products.length;

        sortBubble(products);

        System.out.println("=== Using for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("To index " + i + " : " + products[i]);
        }


        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = (int) 35L;
        numeros[3] = -1;

        sortBubble(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + i + " : " + numeros[i]);
        }

    }
}
