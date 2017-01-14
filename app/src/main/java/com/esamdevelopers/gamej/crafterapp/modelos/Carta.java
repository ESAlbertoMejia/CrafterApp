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
    private int idImagenRef;

    public Carta(float precio, String nombre, int idImagenRef) {
        this.precio = precio;
        this.nombre = nombre;
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
        BEBIDAS.add(new Carta(3.99f, "Café tradicional", R.drawable.cafe_tradicional));
        BEBIDAS.add(new Carta(2.99f, "Capuchino", R.drawable.capuchino));
        BEBIDAS.add(new Carta(4.99f, "Smoothie", R.drawable.smoothie));
        BEBIDAS.add(new Carta(5.99f, "Frozen", R.drawable.frozen));
        BEBIDAS.add(new Carta(1.99f, "Jugos en lata", R.drawable.jugos));

        POSTRES.add(new Carta(2.99f, "Crepa", R.drawable.crepa));
        POSTRES.add(new Carta(3.99f, "Sandwich", R.drawable.sandwichbagel));
        POSTRES.add(new Carta(5.99f, "Pizza", R.drawable.pizza));
        POSTRES.add(new Carta(4.99f, "Panini", R.drawable.panini));
        POSTRES.add(new Carta(1.99f, "Hot Cake", R.drawable.hotcakes));

        FINCAS.add(new Carta(9.99f, "Finca 1", R.drawable.finca));
        FINCAS.add(new Carta(9.99f, "Finca 1", R.drawable.finca));
        FINCAS.add(new Carta(9.99f, "Finca 1", R.drawable.finca));
        FINCAS.add(new Carta(9.99f, "Finca 1", R.drawable.finca));
        FINCAS.add(new Carta(9.99f, "Finca 1", R.drawable.finca));

    }
}