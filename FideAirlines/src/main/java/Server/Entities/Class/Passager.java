package Server.Entities.Class;

import Server.Entities.Abstract.Person;
import Server.Utils.Gender;
import Server.Utils.PaymentMethods;

import java.util.Date;
import java.util.Map;

public class Passager extends Person {
    private String historia;
    private Map<String, String> preferencias;
    private int vueloId;
    private PaymentMethods metodoPago;
    private boolean reserva;

    public Passager(int id, String nombre, String email, String contrasena, Date fechaNacimiento, Gender genero,
                    String pais, String numeroTelefono, String historia, Map<String, String> preferencias,
                    int vueloId, PaymentMethods metodoPago, boolean reserva) {
        super(id, nombre, email, contrasena, fechaNacimiento, genero, pais, numeroTelefono);
        this.historia = historia;
        this.preferencias = preferencias;
        this.vueloId = vueloId;
        this.metodoPago = metodoPago;
        this.reserva = reserva;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
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

    public PaymentMethods getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(PaymentMethods metodoPago) {
        this.metodoPago = metodoPago;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }
}