package com.eampuero.dpoo.proyectoordencompra;

public class Producto implements Comparable<Producto> {
    private String fabricante;
    private String nombre;
    private int precio;

    public Producto(String fabricante, String nombre, int precio) {
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

    @Override
    public int compareTo(Producto a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}
