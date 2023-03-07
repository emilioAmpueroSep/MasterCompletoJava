package D_Poo.ProyectoOrdenCompraProfe;

import java.util.Date;

public class OrdenCompraProfe {

    private int identificador;
    private String descripcion;
    private Date fecha;
    private ClienteProfe cliente;
    private ProductoProfe[] productos;

    private static int ultimoId;
    private int indiceProductos;

    public OrdenCompraProfe(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++ultimoId;
        this.productos = new ProductoProfe[4];
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ClienteProfe getCliente() {
        return cliente;
    }

    public void setCliente(ClienteProfe cliente) {
        this.cliente = cliente;
    }

    public ProductoProfe[] getProductos() {
        return productos;
    }

    public void addProducto(ProductoProfe producto) {
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }
    
    public int getGranTotal(){
        int total = 0;
        for(ProductoProfe p: productos){
            total += p.getPrecio();
        }
        return total;
    }

}
