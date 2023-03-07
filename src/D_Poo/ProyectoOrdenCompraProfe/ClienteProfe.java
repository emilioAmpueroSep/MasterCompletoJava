package D_Poo.ProyectoOrdenCompraProfe;

public class ClienteProfe {
    private String nombre;
    private String apellido;

    public ClienteProfe(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    
}
