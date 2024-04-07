package com.mycompany.fideairlines.Server.Entities;
import java.util.Date;

public  class Fly {    private int numeroVuelo;
    private Date fechaSalida;
    private Date fechaEntrada;
    private String clase;
    private double precio;
    private int destinoId;
    private int aerolineaId;

    // Constructor
    public Fly(int numeroVuelo, Date fechaSalida, Date fechaEntrada, String clase, double precio, int destinoId, int aerolineaId) {
        this.numeroVuelo = numeroVuelo;
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
        this.clase = clase;
        this.precio = precio;
        this.destinoId = destinoId;
        this.aerolineaId = aerolineaId;
    }

    // Getters y setters
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDestinoId() {
        return destinoId;
    }

    public void setDestinoId(int destinoId) {
        this.destinoId = destinoId;
    }

    public int getAerolineaId() {
        return aerolineaId;
    }

    public void setAerolineaId(int aerolineaId) {
        this.aerolineaId = aerolineaId;
    }
}