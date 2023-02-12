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

        if (cantNotas != 3) {
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

        System.out.println("El promedio de los aprobados con nota mayor a 5) es: " + (notasMas5 / cantNotasMas5));
        System.out.println("El promedio de los suspendidos (nota < 4) es: " + (notasMen4 / cantNotasMen4));
        System.out.println("La cantidad de notas 1 son: " + contadorNotas1);
        System.out.println("El promedio final es: " + (promedioTotal / cantNotas));


        // =========================================================================================================

//                //Variables
//                Scanner userInput = new Scanner(System.in);
//                String[] nombres = new String[20];
//                int arrayLength = nombres.length; //Longitud de los arrays, puesto optimizar (asi no hay que calcularlo)
//                double[] notas = new double[nombres.length];
//                double promedio = 0;
//                double promedioAP = 0;
//                double promedioSUS = 0;
//                int numeroUnos = 0;
//                int numeroAP = 0;
//                int numeroSUS = 0;
//                //Programa
//                System.out.println("________________________________AVISO______________________________");
//                System.out.println("|Recuerda que este programa te pide todas las notas juntas recuerda|");
//                System.out.println("|tener todas las notas puestas antes de seguir,                    |");
//                System.out.println("|__________________________________________________________________|\n\n");
//                System.out.println("Bienvenido al programa, vamos a poner las notas");
//                for (int i = 0; i < arrayLength; i++) {
//                    System.out.println("Escribe el nombre del alumno" + '(' + (i + 1) + '/' + arrayLength + ')');
//                    nombres[i] = userInput.nextLine();
//                }
//                for (int i = 0; i < arrayLength; i++) {
//                    System.out.println("Escribe la nota de " + nombres[i]);
//                    try {
//                        notas[i] = userInput.nextInt();
//                    } catch (Exception e) {
//                        System.out.println("Debe ser un numero del 0 a 7");
//                    }
//                    if (notas[i] > 7 || notas[i] < 0) {
//                        System.out.println("La nota debe ser un numero entre 0 y 7");
//                        i--;
//
//                    }
//                    // no voy a hacer lo del 0 pues considero al cero una nota valida (si no acertaste nada)
//                }
//                for (int i = 0; i < arrayLength; i++) {
//                    System.out.println("La nota de " + nombres[i] + " es: " + notas[i] + " y por lo tanto " + ((notas[i] >= 5) ? "ha aprobado" : "ha suspendido"));
//                }
//                System.out.println("Los aprobado son");
//                for (int i = 0; i < arrayLength; i++) {
//                    if (notas[i] >= 5) {
//                        promedioAP = promedioAP + notas[i];
//                        promedio = promedio + notas[i];
//                        numeroAP++;
//                    }else{
//                        if (notas[i] == 1) {
//                            numeroUnos++;
//                        }
//                        numeroSUS++;
//                        promedioSUS = promedioSUS + notas[i];
//                    }
//                }
//                System.out.println("El promedio de los aprobados (nota >= 5) es: " + (promedioAP / numeroAP));
//                System.out.println("El promedio de los suspendidos (nota < 5) es: " + (promedioSUS / numeroSUS));
//                System.out.println("El promedio general es: " + (promedio / arrayLength));
//                System.out.println("El numero de personas con la nota 1 es: " + numeroUnos);

    } // end main

} // end class



