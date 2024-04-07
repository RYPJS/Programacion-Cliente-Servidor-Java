package com.mycompany.fideairlines.Server.Entities;

public class Airline {
    private int id;
    private String nombre;
    private String servicios;

    // Constructor
    public Airline(int id, String nombre, String servicios) {
        this.id = id;
        this.nombre = nombre;
        this.servicios = servicios;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }
}