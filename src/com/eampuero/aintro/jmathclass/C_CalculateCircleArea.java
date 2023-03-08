package com.eampuero.aintro.jmathclass;

import java.util.Scanner;

public class C_CalculateCircleArea {

/*
    Pedir el radio de un círculo y calcular su área.

    utilizar la formula:
    area = PI*r² (Constante PI multiplicado por el radio al cuadrado).

    Recomiendo primero implementar la tarea en el IDE para probarla y revisarla bien, luego publica tu código de la clase main por esta vía.
*/
public static void main(String[] args) {
        int radio;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo:");
        radio = sc.nextInt();
        area = (radio * radio) * Math.PI;

        System.out.println("El area del circulo es:" + area);



/*

//  Profe:

        double area; // el área a calcular

        double radio; // radio a ingresar
        System.out.println("Introduce el radio de un circulo: ");
        radio = scanner.nextDouble();
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área de una circunferencia de radio " + radio + " es: " + area);
*/

}
}
