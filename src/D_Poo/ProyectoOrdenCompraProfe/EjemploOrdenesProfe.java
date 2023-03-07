package D_Poo.ProyectoOrdenCompraProfe;

import java.util.Date;


public class EjemploOrdenesProfe {
    public static void main(String[] args) {
        
        OrdenCompraProfe orden1 = new OrdenCompraProfe("Compras componentes pc");
        orden1.setCliente(new ClienteProfe("Andres", "Guzman"));
        orden1.setFecha(new Date());

        orden1.addProducto(new ProductoProfe("Western Digital", "Unidad SSD 480GB", 54890));
        orden1.addProducto(new ProductoProfe("MSI", "Monitor Optix G271", 363940));
        orden1.addProducto(new ProductoProfe("AMD", "Procesador AMD Ryzen 9 5900X", 599990));
        orden1.addProducto(new ProductoProfe("EVGA", "Tarjeta de video EVGA RTX 3080Ti", 1849990));

        OrdenCompraProfe orden2 = new OrdenCompraProfe("Compras Electrodomésticos");
        orden2.setCliente(new ClienteProfe("John", "Doe"));
        orden2.setFecha(new Date());
        orden2.addProducto(new ProductoProfe("Fensa", "Cocina", 239990));
        orden2.addProducto(new ProductoProfe("Samsung", "Refrigerador", 429990));
        orden2.addProducto(new ProductoProfe("Midea", "Lavadora", 149990));
        orden2.addProducto(new ProductoProfe("Aspiradora", "IRobot", 199990));

        OrdenCompraProfe orden3 = new OrdenCompraProfe("Compras materiales de construcción");
        orden3.setCliente(new ClienteProfe("Pepa", "Roe"));
        orden3.setFecha(new Date());
        orden3.addProducto(new ProductoProfe("Melon", "Cemento 25kg", 4870));
        orden3.addProducto(new ProductoProfe("Grau", "Hormigon", 6040));
        orden3.addProducto(new ProductoProfe("Ceramicas Santiago", "Ladrillo", 790));
        orden3.addProducto(new ProductoProfe("Redline", "Escala articulada aluminio", 48990));
        
        OrdenCompraProfe[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompraProfe orden : ordenes) {
            System.out.println("Folio: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            int i = 1;
            for (ProductoProfe p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }
    }
 
}
