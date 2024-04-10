package com.mycompany.fideairlines.Server.Entities;
import com.mycompany.fideairlines.Server.Utils.PaymentMethods;
import com.mycompany.fideairlines.Server.Utils.Category;
import java.util.Date;

public  class Fly {    private int numeroVuelo;
    private Date fechaSalida;
    private Date fechaEntrada;
    private Category clase;
    private double precio;
    private int destinoId;
    private PaymentMethods pago;

    public Fly(int numeroVuelo, Date fechaSalida, Date fechaEntrada, Category clase, double precio, int destinoId, PaymentMethods pago) {
        this.numeroVuelo = numeroVuelo;
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
        this.clase = clase;
        this.precio = precio;
        this.destinoId = destinoId;
        this.pago = pago;
    }

    
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

    public Category getClase() {
        return clase;
    }

    public void setClase(Category clase) {
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

    public PaymentMethods getPago() {
        return pago;
    }

    public void setPago(PaymentMethods pago) {
        this.pago = pago;
    }
    
    
}