package D_Poo.ProyectoOrdenCompra;

import D_Poo.Automobile;
import D_Poo.Wheel;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {

    private Integer identificador;
    private static Integer ultimoId = 0;
    private String descripcion;
    private Date fecha = new Date();
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProducto;
    private OrdenCompra fabri;


    public OrdenCompra() {
        this.identificador = ++this.ultimoId;
        this.productos = new Producto[4];
    }

    public OrdenCompra(String descripcion) {
        this();
        this.descripcion = descripcion;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public OrdenCompra addProducto(Producto producto) {
        if (indiceProducto < this.productos.length) {
            this.productos[indiceProducto++] = producto;
        }
        return this;
    }

    public void listarProductos() {
        if (getProductos() != null) {
            Arrays.sort(this.getProductos());
            for (Producto prod : this.getProductos()) {
                System.out.println(prod.getFabricante() + " " + prod.getNombre() + " " + prod.getPrecio());
            }
        }
    }

    public int granTotal() {
        int sumaTotal = 0;
        for (Producto prod : this.getProductos()) {
            sumaTotal += prod.getPrecio();
        }
        return sumaTotal;
    }

    public void detallarOC() {
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' yyyy");
        String fechaStr = df.format(this.getFecha());

        String detallarOC = "Orden numero: " + this.identificador + "\n" +
                "Cliente a quien esta hecha la orden: " + this.getCliente() + "\n" +
                "Descripcion de la Orden: " + getDescripcion() + "\n" +
                "Con fecha de: " + fechaStr + "\n"
                + "Productos de la OC: ";

        System.out.println(detallarOC);

        listarProductos();

        System.out.println("El total de los productos son: $" + granTotal());
    }
}
