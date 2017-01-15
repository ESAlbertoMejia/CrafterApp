package com.esamdevelopers.gamej.crafterapp.modelos;

import com.esamdevelopers.gamej.crafterapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gamej on 14/1/2017.
 */

public class Carta {
    private float precio;
    private String nombre;
    private String descripcion;
    private int idImagenRef;

    public Carta(float precio, String nombre, String descripcion, int idImagenRef) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idImagenRef = idImagenRef;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdImagenRef() {
        return idImagenRef;
    }

    public void setIdImagenRef(int idImagenRef) {
        this.idImagenRef = idImagenRef;
    }

    public static final List<Carta> BEBIDAS = new ArrayList<>();
    public static final List<Carta> POSTRES = new ArrayList<>();
    public static final List<Carta> FINCAS = new ArrayList<>();

    static {
        BEBIDAS.add(new Carta(3.99f, "Café tradicional", "Cafe negro tradicional", R.drawable.cafe_tradicional));
        BEBIDAS.add(new Carta(2.99f, "Capuchino", "Capuchino", R.drawable.capuchino));
        BEBIDAS.add(new Carta(4.99f, "Smoothie", "Smoothie", R.drawable.smoothie));
        BEBIDAS.add(new Carta(5.99f, "Frozen", "Frozen", R.drawable.frozen));
        BEBIDAS.add(new Carta(1.99f, "Jugos en lata", "Jugos en lata", R.drawable.jugos));

        POSTRES.add(new Carta(2.99f, "Crepa", "Dulces y saladas", R.drawable.crepa));
        POSTRES.add(new Carta(3.99f, "Sandwich", "Pan suave", R.drawable.sandwichbagel));
        POSTRES.add(new Carta(5.99f, "Pizza", "Peperoni, jamon y suprema", R.drawable.pizza));
        POSTRES.add(new Carta(4.99f, "Panini", "Panini", R.drawable.panini));
        POSTRES.add(new Carta(1.99f, "Hot Cake", "Hot Cake", R.drawable.hotcakes));

        FINCAS.add(new Carta(9.99f, "Finca 1", "Finca 1", R.drawable.finca));
        FINCAS.add(new Carta(9.99f, "Finca 1", "Finca 1", R.drawable.finca));
        FINCAS.add(new Carta(9.99f, "Finca 1", "Finca 1", R.drawable.finca));
        FINCAS.add(new Carta(9.99f, "Finca 1", "Finca 1", R.drawable.finca));
        FINCAS.add(new Carta(9.99f, "Finca 1", "Finca 1", R.drawable.finca));

    }
}