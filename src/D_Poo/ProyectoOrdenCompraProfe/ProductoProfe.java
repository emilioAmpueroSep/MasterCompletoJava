package D_Poo.ProyectoOrdenCompraProfe;

public class ProductoProfe {
    
    private String fabricante;
    private String nombre;
    private int precio;

    public ProductoProfe(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
    
    
    
}
