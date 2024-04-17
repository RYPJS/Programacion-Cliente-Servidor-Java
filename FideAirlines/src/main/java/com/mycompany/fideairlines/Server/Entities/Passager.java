package com.mycompany.fideairlines.Server.Entities;

import com.mycompany.fideairlines.Server.Abstract.Person;
import com.mycompany.fideairlines.Server.Utils.DBconexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import javax.swing.JOptionPane;

public class Passager extends Person {

    private String[] historial;
    private Map<String, String> preferencias;
    private int vueloId;
    private boolean reserva;

    public Passager() {
    }

    public Passager(String email) {
        super(email);
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

    public void crearCliente(Passager cliente) {
        try {
            // Creamos la conexión con la base de datos
            Connection nuevaConexion = DBconexion.ConectarBD();

            // Definimos el comando con parámetros
            String comando_Insert = "INSERT INTO clientes (NOMBRE, EMAIL, CONTRASENA, NUMEROTELEFONO) VALUES (?, ?, ?, ?)";
            PreparedStatement nuevoStatamentPreparado = (PreparedStatement) nuevaConexion.prepareStatement(comando_Insert);

            // Definimos los parámetros del evento que recibimos como parámetro
            nuevoStatamentPreparado.setString(1, cliente.getNombre());
            nuevoStatamentPreparado.setString(2, cliente.getEmail());
            nuevoStatamentPreparado.setString(3, cliente.getContrasena());
            nuevoStatamentPreparado.setString(4, cliente.getNumeroTelefono());

            nuevoStatamentPreparado.executeUpdate();

            nuevaConexion.close();
            JOptionPane.showMessageDialog(null, "Se creo su cuenta");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo craar la cuenta. Error: " + ex.getMessage());

        }
    }

    public boolean buscarCliente(Passager cliente) {
        boolean clienteEncontrado = false;
        try {
            Connection nuevaConexion = DBconexion.ConectarBD();

            String comandoSelect = "SELECT * FROM clientes WHERE EMAIL = ? AND CONTRASENA = ?";
            PreparedStatement nuevoStatementPreparado = nuevaConexion.prepareStatement(comandoSelect);
            nuevoStatementPreparado.setString(1, cliente.getEmail()); 
            nuevoStatementPreparado.setString(2, cliente.getContrasena());

            ResultSet resultado = nuevoStatementPreparado.executeQuery();

            if (resultado.next()) {
                clienteEncontrado = true;
            }

            nuevaConexion.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar cliente: " + ex.getMessage());
        }
        return clienteEncontrado;
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
