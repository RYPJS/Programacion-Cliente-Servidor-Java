package com.mycompany.fideairlines.Server.Entities;

public class Airline {
    private String nombre;
    private String servicios;
    private Destination[] destinos;

    public Airline(String nombre, String servicios, Destination[] destinos) {
        this.nombre = nombre;
        this.servicios = servicios;
        this.destinos = destinos;
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

    public Destination[] getDestinos() {
        return destinos;
    }

    public void setDestinos(Destination[] destinos) {
        this.destinos = destinos;
    }
    
    
}