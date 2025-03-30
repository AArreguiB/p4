package com.example.API_recetas.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Ingrediente {
    private String nombre;
    private String cantidad;

    // Getters y Setters

    public Ingrediente(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
