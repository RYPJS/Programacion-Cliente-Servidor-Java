/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Kevin
 */
public class Aerolinea {
    private int Id;
    private String nombreAerolinea;
    private Double precio;
    private int asientos;

    public Aerolinea() {
    }

    public Aerolinea(int Id, String nombreAerolinea, Double precio, int asientos) {
        this.Id = Id;
        this.nombreAerolinea = nombreAerolinea;
        this.precio = precio;
        this.asientos = asientos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

}
