package _B_Variables;

import java.util.Scanner;

public class J_DetalleDeFactura {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre de factura o su descripcion:");
        String nombreFactura = sc.nextLine();

        System.out.println("Ingrese precio de producto 1:");
        double prodUno = sc.nextDouble();

        System.out.println("Ingrese precio de producto 2:");
        double prodDos = sc.nextDouble();

        double iva = 0.19D;

        double totalBruto = (prodUno + prodDos);

        double impuestoIva = (totalBruto * iva);

        double montoTotalNeto = (totalBruto + impuestoIva);

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de "+ totalBruto +
                ", con un impuesto de " + impuestoIva + " y el monto después de impuesto es de " + montoTotalNeto);

        sc.close();

/*
        // Exercise of teacher:

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre para la factura:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese un precio de producto:");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese un segundo precio de producto:");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String detalle = "La factura " + nombre + " tiene un total bruto de " + totalBruto
                + ", con un impuesto de " + impuesto
                + " y el monto despues de impuesto es de " + totalNeto;

        System.out.println(detalle);
*/


    }
}





