package com.eampuero.aintro.econtrolflows;

import java.util.Scanner;

public class M_Multiplicar2Nums {
    public static void main(String[] args) {
/*
 Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
 Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
*/
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 0, resultado = 0;

        System.out.println("Ingrese un numero:");
        num1 = sc.nextInt();

        System.out.println("Ingrese otro numero:");
        num2 = sc.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.out.println("No es posible multiplicar por 0");
            return;
        } else if ((num1 < 0 && num2 < 0) || num2 < 0) {
            num1 = -num1;
            num2 = -num2; // Si solo num2 es menor, calcula num2 que viene como -num2 y lo compara con este -num2 y lo pasa a positivo (- x - = +)
        } else if (num1 < 0) {
            num1 = +num1;
        }
        for (int i = 1; i <= num2; i++) {
            resultado += num1;
        }

        System.out.println("El resultado de la multiplicacion es: " + resultado);
    }

//    PROFE:
//    System.out.println("Ingrese el numero a: ");
//    int a = scanner.nextInt();
//
//        System.out.println("Ingrese el numero b: ");
//    int b = scanner.nextInt();
//    int resultado = 0;
//
//    // verificamos los signos de cada uno, si es positivo o negativo
//    boolean positivoB = b > -1;
//    boolean positivoA = a > -1;
//
//    // calculamos el valor absoluto de a
//    int absolutoA = positivoA? a: -a; // equivalente a Math.abs(a);
//
//    // sumamos tantas veces el valor de b, segun el valor de a.
//        for(int i = 0; i < absolutoA; i++){
//        resultado = resultado + b;
//    }
//
//    // si ambos son negativos o si solo a es negativo damos vuelta el signo
//        if((!positivoA && !positivoB) || !positivoA){
//        resultado = -resultado;
//    }
//
//        System.out.println("el resultado es " + resultado);
}

