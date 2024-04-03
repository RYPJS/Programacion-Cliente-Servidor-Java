/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Kevin
 */
public class Reservas {
    private int id;
    private int idEmpleado;
    private int idVuelo;
    private String fecha_Viaje;

    public Reservas() {
    }

    public Reservas(int id, int idEmpleado, int idVuelo, String fecha_Viaje) {
        this.id = id;
        this.idEmpleado = idEmpleado;
        this.idVuelo = idVuelo;
        this.fecha_Viaje = fecha_Viaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getFecha_Viaje() {
        return fecha_Viaje;
    }

    public void setFecha_Viaje(String fecha_Viaje) {
        this.fecha_Viaje = fecha_Viaje;
    }
   
}
