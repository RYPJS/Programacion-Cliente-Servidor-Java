package com.mycompany.fideairlines.Server.Entities;
import com.mycompany.fideairlines.Server.Abstract.Person;
import java.util.Map;

public class Passager extends Person {
    private String[] historial;
    private Map<String, String> preferencias;
    private int vueloId;
    private boolean reserva;

    public Passager() {
    }

    public Passager(String[] historial, Map<String, String> preferencias, int vueloId, boolean reserva) {
        this.historial = historial;
        this.preferencias = preferencias;
        this.vueloId = vueloId;
        this.reserva = reserva;
    }

    public Passager(String[] historial, Map<String, String> preferencias, int vueloId, boolean reserva, String nombre, String email, String contrasena, String numeroTelefono) {
        super(nombre, email, contrasena, numeroTelefono);
        this.historial = historial;
        this.preferencias = preferencias;
        this.vueloId = vueloId;
        this.reserva = reserva;
    }

    


    public String[] getHistorial() {
        return historial;
    }

    public void setHistorial(String[] historial) {
        this.historial = historial;
    }

    public Map<String, String> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(Map<String, String> preferencias) {
        this.preferencias = preferencias;
    }

    public int getVueloId() {
        return vueloId;
    }

    public void setVueloId(int vueloId) {
        this.vueloId = vueloId;
    }


    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

}