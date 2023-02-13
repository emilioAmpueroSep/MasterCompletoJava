package _E_ControlFlows;

import java.util.Scanner;

/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio
de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar
los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
 */
public class L_NotasEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de notas a ingresar:");
        int cantNotas = sc.nextInt();

        double notasMas5 = 0, notasMen4 = 0, promedioTotal = 0;
        int cantNotasMas5 = 0, cantNotasMen4 = 0, contadorNotas1 = 0;
        double[] arrNotas = new double[cantNotas];

        if (cantNotas != 20) {
            System.out.println("La cantidad de notas debe ser igual a 20");
            return;
        } else for (int i = 0; i < cantNotas; i++) {
            System.out.println("En una escala de 1 a 7. Ingrese nota numero " + (i + 1));
            arrNotas[i] = sc.nextDouble();
            if (arrNotas[i] == 0) {
                System.out.println("Programa terminado");
                break;
            } else if (arrNotas[i] > 5) {
                notasMas5 += arrNotas[i];
                cantNotasMas5++;
            } else if (arrNotas[i] < 4) {
                notasMen4 += arrNotas[i];
                cantNotasMen4++;
                if (arrNotas[i] == 1) {
                    contadorNotas1++;
                }
            }
            promedioTotal += arrNotas[i];

        }

        System.out.println("El promedio de los aprobados con nota mayor a 5 es: " + (notasMas5 / cantNotasMas5));
        System.out.println("El promedio de los suspendidos con nota menor a 4 es: " + (notasMen4 / cantNotasMen4));
        System.out.println("La cantidad de notas 1 son: " + contadorNotas1);
        System.out.println("El promedio final es: " + (promedioTotal / cantNotas));


        // =========================================================================================================

        // PROFE
//        double nota; // la nota a ingresar
//        int contNotas1 = 0; // el contador de notas 1
//        int contNotasMayoresA5 = 0; // contador de notas mayores a 5
//        int contNotasMenoresA4 = 0; // contador de notas menores a 4
//        double sumaNotasMayoresA5 = 0; // suma de notas mayores a 5
//        double sumaNotasMenoresA4 = 0; // suma de notas menores a 4
//        double sumaTotal = 0; // suma total de notas
//
//        double promedioNotasMayoresA5, promedioNotasMenoresA4; // los promedios de notas mayores a 5 y menores a 4
//
//        boolean error = false;
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println("Introduce una nota (entre 1 y 7) N" + (i + 1) + ": ");
//            nota = scanner.nextDouble();
//
//            if (nota == 0) {
//                error = true;
//                break;
//            }
//
//            if (nota == 1) {
//                contNotas1++;
//            } else {
//                if (nota > 5) {
//                    contNotasMayoresA5++;
//                    sumaNotasMayoresA5 += nota;
//                } else if (nota < 4) {
//                    contNotasMenoresA4++;
//                    sumaNotasMenoresA4 += nota;
//                }
//            }
//            sumaTotal += nota;
//        }
//        if (error) {
//            System.err.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecución del programa.");
//            System.exit(1);
//        }
//        // mostramos la cantidad de notas 1
//        System.out.println("El número de notas 1 es de: " + contNotas1);
//        //trabajamos con las notas superiores a 5
//        if (contNotasMayoresA5 == 0) {
//            System.out.println("No se puede calcular el promedio de notas sobre 5");
//        } else {
//            promedioNotasMayoresA5 = sumaNotasMayoresA5 / contNotasMayoresA5;
//            System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
//        }
//
//        // trabajamos con las notas inferiores a 4
//        if (contNotasMenoresA4 == 0) {
//            System.out.println("No se puede calcular el promedio de notas bajo 4");
//        } else {
//            promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4;
//            System.out.println("Promedio de notas menores a 3: " + promedioNotasMenoresA4);
//        }
//
//        // promedio total de las notas
//        double promedioTotalNotas = sumaTotal / 20;
//        System.out.println("Promedio total de notas: " + promedioTotalNotas);

    } // end main

} // end class



