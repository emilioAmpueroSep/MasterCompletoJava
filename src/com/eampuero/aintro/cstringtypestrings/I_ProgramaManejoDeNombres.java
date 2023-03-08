package com.eampuero.aintro.cstringtypestrings;

public class I_ProgramaManejoDeNombres {
    public static void main(String[] args) {
        /*
        Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

        Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero
        convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como: N.es

        Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

        Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

        N.es_A.ia_E.pe
        */

        String nombreMama = "Adriana";
        String nombrePapa = "Salvador";
        String nombreHijo = "Emilio";

        String nomMamaMayus = nombreMama.toUpperCase();
        String caracter2m = nomMamaMayus.charAt(1) + ".";
        String ultimosCaracteresm = nombreMama.substring(nombreMama.length()-2);
        String nombreMamaFinal = caracter2m + ultimosCaracteresm;

        String nomPapaMayus = nombrePapa.toUpperCase();
        String caracter2p = nomPapaMayus.charAt(1) + ".";
        String ultimosCaracteresp = nombrePapa.substring(nombrePapa.length()-2);
        String nombrePapaFinal = caracter2p + ultimosCaracteresp;

        String nomHijoMayus = nombreHijo.toUpperCase();
        String caracter2h = nomHijoMayus.charAt(1) + ".";
        String ultimosCaracteresh = nombreHijo.substring(nombreHijo.length()-2);
        String nombreHijoFinal = caracter2h + ultimosCaracteresh;

        String varFamiliar = nombreMamaFinal + "_" + nombrePapaFinal + "_" + nombreHijoFinal;
        System.out.print(varFamiliar);


/*      // Profe:
import java.util.Scanner;

        public class ProgramaManejoDeNombres {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Ingrese un nombre de un familiar:");
                String nombreA = scanner.nextLine();
                String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

                System.out.println("Ingrese otro nombre de un familiar:");
                String nombreB = scanner.nextLine();
                String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

                System.out.println("Ingrese otro nombre de un familiar:");
                String nombreC = scanner.nextLine();
                String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

                String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

                System.out.println(resultado);
            }
        }
*/


    }
}
