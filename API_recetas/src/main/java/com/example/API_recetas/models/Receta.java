package com.example.API_recetas.models;

import jakarta.persistence.*;

import java.util.List;

@Entity //Se indica que es una tabla de la base de datos
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Esto hace que se genere automaticamente un ID unico para cada receta
    private Long id;
    private String nombre;
    private String categoria;
    private String tiempoPreparacion;
    private String dificultad;
    @ElementCollection
    @CollectionTable(name = "ingredientes", joinColumns = @JoinColumn(name = "receta_id"))
    @Column(name = "ingrediente")
    private List<Ingrediente> ingredientes;
    private String fotoUrl;
    private String preparacion;
    private int cocineros;



    //Constructor
    public Receta(){}

    public Receta(String nombre, int i) {
    }

    /*public Receta(String nombre, String categoria, String tiempoPreparacion, String dificultad,
                  List<Ingrediente> ingredientes, String fotoUrl, String preparacion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.tiempoPreparacion = tiempoPreparacion;
        this.dificultad = dificultad;
        this.ingredientes = ingredientes;
        this.fotoUrl = fotoUrl;
        this.preparacion = preparacion;
    }*/

    // Getters y setters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(String tiempo) {
        this.tiempoPreparacion = tiempo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
    public int getCocineros() {
        return cocineros;
    }
    public void setCocineros(int cocineros) {
        this.cocineros = cocineros;
    }
}
