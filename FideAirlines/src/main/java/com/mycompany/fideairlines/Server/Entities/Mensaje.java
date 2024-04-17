/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fideairlines.Server.Entities;

import java.io.Serializable;

/**
 *
 * @author kenda
 */
public class Mensaje implements Serializable{
    private String mensaje; 
    private String origen;
    public Mensaje() {
    }
    public Mensaje(String Mensaje){
        this.mensaje = Mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Mensaje(String mensaje, String origen) {
        this.mensaje = mensaje;
        this.origen = origen;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
