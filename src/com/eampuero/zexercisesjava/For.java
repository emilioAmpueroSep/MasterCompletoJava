package com.eampuero.zexercisesjava;

public class For {
    public static void main(String[] args) {

//        http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html

/*
        1. Programa Java que muestre los números del 1 al 100 utilizando la instrucción while
        int counter = 1;

        while(counter <= 100){
            System.out.println(counter);
            counter++;
        }
*/
//        2. Programa Java que muestre los números del 1 al 100 utilizando la instrucción do..while

        /*
        int counter = 1;
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 100);

        */

//        3. Programa Java que muestre los números del 1 al 100 utilizando la instrucción for
/*
        for(int i = 1; i <= 100; i++){
            System.out.println("i = " + i);
        }
*/
//        4. Programa Java que muestre los números del 100 al 1 utilizando la instrucción while
//        int counter = 100;
//
//        while (counter >= 1) {
//            System.out.println(counter);
//            counter--;
//        }

//        5. Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while
//        int counter = 100;
//
//        do {
//            System.out.println(counter);
//            counter--;
//       } while (counter >= 1);
//
//        6. Programa Java que muestre los números del 100 al 1 utilizando la instrucción for

//        for (int i = 100; i >= 1 ; i--) {
//            System.out.println("i = " + i);
//        }

//        9. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor

//        int num1 = 30, num2 =50;

//        for (; num1 <= num2; num1++) {
//            System.out.println(num1);
//        }

//        10. Programa Java que lea dos números y muestre los números pares entre ellos
        int num1 = 30, num2 = 50;
        
        for (; num1 <= num2; num1++) {
            if (num1 % 2 == 0) {
                System.out.println("num1 = " + num1);
            }
        }


//        11. Programa que muestre los múltiplos de un número desde 1 hasta M
//
//        12. Programa que lea números e indique si son positivos o negativos y pares o impares
//
//        13. Programa que pase de millas a kilómetros
//
//        14. Contar los números introducidos por teclado
//
//        15. Contar los números positivos introducidos por teclado

    }
}
