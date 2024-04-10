package com.mycompany.fideairlines.Server.Entities;

public class Destination {
    private int id;
    private String nombre;
    private String horasViaje;

    
    public Destination(int id, String nombre, String horasViaje) {
        this.id = id;
        this.nombre = nombre;
        this.horasViaje = horasViaje;
    }

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

    public String getHorasViaje() {
        return horasViaje;
    }

    public void setHorasViaje(String horasViaje) {
        this.horasViaje = horasViaje;
    }
}
