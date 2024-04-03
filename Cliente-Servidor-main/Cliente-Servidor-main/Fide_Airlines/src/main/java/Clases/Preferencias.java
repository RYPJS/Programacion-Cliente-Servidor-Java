package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aaron
 */
public class Preferencias {
    private int id;
    private String aerolinea;
    private String tipoClase;

    public Preferencias() {
    }

    public Preferencias(int id, String aerolinea, String tipoClase) {
        this.id = id;
        this.aerolinea = aerolinea;
        this.tipoClase = tipoClase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(String tipoClase) {
        this.tipoClase = tipoClase;
    }

    
    
    public static void CrearP()
    {
        //Codigo
    }
    
    public static void ActualizarP()
    {
        //Codigo
    }
}
