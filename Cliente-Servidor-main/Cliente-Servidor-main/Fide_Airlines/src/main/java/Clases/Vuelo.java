/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Kevin
 */
public class Vuelo {
    private int id;
    private String origen;
    private String destino;
    private String tipoClase;
    private String duracion;
    private int idAerolinea;

    public Vuelo() {
    }

    public Vuelo(int id, String origen, String destino, String tipoClase, String duracion, int idAerolinea) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.tipoClase = tipoClase;
        this.duracion = duracion;
        this.idAerolinea = idAerolinea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(String tipoClase) {
        this.tipoClase = tipoClase;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getIdAerolinea() {
        return idAerolinea;
    }

    public void setIdAerolinea(int idAerolinea) {
        this.idAerolinea = idAerolinea;
    }
 
}
