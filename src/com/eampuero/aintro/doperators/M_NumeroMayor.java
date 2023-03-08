package com.eampuero.aintro.doperators;

import java.util.Scanner;

public class M_NumeroMayor {
    public static void main(String[] args) {
/*
        El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
                Podría ser utilizando operador ternario.
*/
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;


        System.out.println("Ingrese un numero:");

        try {
            num1 = sc.nextInt();
        } catch (Exception e){
            System.out.println("Error, debes ingresar solamente numeros");
            main(args);
            System.exit(0);
        }

        System.out.println("Ingrese otro numero:");

        try {
            num2 = sc.nextInt();
        } catch (Exception e){
            System.out.println("Error, debes ingresar solamente numeros");
            main(args);
            System.exit(0);
        }

        if (num1 > num2) {
            System.out.println(num1+", "+num2);
        } else if (num1 < num2) {
            System.out.println(num2+", "+num1);
        }else{
            System.out.println("Ambos numeros son iguales, favor ingresar distintos");
        }

        sc.close();

/*
        // Profe:

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int num2 = scanner.nextInt();

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es: " + resultado);
*/

    }
}
