package com.eampuero.aintro.econtrolflows;

/*
        Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
        usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar
        el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:

        - Calcular el menor número e imprimir el valor.

        - Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir
            (" el numero menor es igual o mayor que 10!").
*/

import java.util.Scanner;
public class K_CalcularNumMenorMultiplesValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las cantidades de valores que desee agregar: ");
        int valorIngresado = sc.nextInt();
        int[] arr = new int[valorIngresado];

        int maximoValores = arr.length;

        for (int i = 0; i < maximoValores; i++) {
            System.out.print("Ingrese valor " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int valMenor = arr[0];

        for (int j : arr) {
            if (j < valMenor) {
                valMenor = j;
            }
        }
        System.out.println("El número de menor valor es: "+valMenor);
        String resultado = (valMenor < 10) ? "El número " + valMenor + " es menor que 10!"
                : "el numero " + valMenor + " es igual o mayor que 10!";
        System.out.println(resultado);
    }


    // PROFE:
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingrese la cantidad de números a comparar: ");
//        int cantidad = scanner.nextInt();
//
//        // preguntamos si es menor a 10, ya que el mínimo según la letra de la tarea es 10 (buscar el número menor de minimo 10 valores enteros).
//        if (cantidad < 10) {
//            System.out.println("Error: Debe comparar al menos 10 números enteros!");
//        } else {
//            int menor = Integer.MAX_VALUE; // asignamos un valor máximo por defecto como numero menor para comenzar
//            int numero;
//
//            for (int i = 0; i < cantidad; i++) {
//                System.out.println("Ingrese el numero " + (i + 1) + ": ");
//                numero = scanner.nextInt();
//                menor = (numero < menor) ? numero : menor;
//            }
//
//            System.out.println("El número menor es: " + menor);
//
//            if (menor < 10) {
//                System.out.println("El número " + menor + " es menor que 10!");
//            } else {
//                System.out.println("El número " + menor + " es igual o mayor que 10!");
//            }
//        } // fin else
//    }// fin main
}// fin class






