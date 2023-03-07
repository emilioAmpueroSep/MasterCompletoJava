package D_Poo.ProyectoOrdenCompra;

import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {
        Producto[] arrProductos = new Producto[4];
        OrdenCompra orden1 = new OrdenCompra("Orden de compra numero 1");
        Cliente cli1 = new Cliente("Juan", "Perez");
        orden1.setCliente(cli1);
        orden1.addProducto(new Producto("Chevrolet", "Astra Enjoy", 4000000));
        orden1.addProducto(new Producto("Dodge", "Caravan", 3000000));
        orden1.addProducto(new Producto("Ford", "Escort", 5000000));
        orden1.addProducto(new Producto("Chrysler", "A32", 7000000));


        Producto[] arrProductos2 = new Producto[4];
        OrdenCompra orden2 = new OrdenCompra("Orden de compra numero 2");
        Cliente cli2 = new Cliente("Abel", "Reyes");
        orden2.setCliente(cli2);
        orden2.addProducto(new Producto("Peugeout", "206", 2000000));
        orden2.addProducto(new Producto("Renault", "Clio", 2000000));
        orden2.addProducto(new Producto("Citroen", "C3", 2000000));
        orden2.addProducto(new Producto("Opel", "Astra Enjoy", 2000000));


        Producto[] arrProductos3 = new Producto[4];
        OrdenCompra orden3 = new OrdenCompra("Orden de compra numero 3");
        Cliente cli3 = new Cliente("Jorge", "Fitipaldi");
        orden3.setCliente(cli3);
        orden3.addProducto(new Producto("Kia", "Rio", 1000000));
        orden3.addProducto(new Producto("Sms", "C45", 1000000));
        orden3.addProducto(new Producto("Hyunday", "Elantra", 1000000));
        orden3.addProducto(new Producto("Asia", "FR45", 1000000));


        System.out.println("=============================================\n");
        orden1.detallarOC();
        System.out.println("=============================================\n");
        orden2.detallarOC();
        System.out.println("=============================================\n");
        orden3.detallarOC();
        System.out.println("=============================================");


    }

}
