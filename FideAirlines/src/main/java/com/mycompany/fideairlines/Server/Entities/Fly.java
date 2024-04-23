package com.mycompany.fideairlines.Server.Entities;

import com.mycompany.fideairlines.Server.Utils.PaymentMethods;
import com.mycompany.fideairlines.Server.Utils.Category;
import com.mycompany.fideairlines.Server.Utils.DBconexion;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class Fly implements Serializable{

    private int numeroVuelo;
    private String fechaSalida;
    private String fechaEntrada;
    private Category clase;
    private double precio;
    private String destinoId;
    private Destination index;
    private PaymentMethods pago;

    public Fly(int numeroVuelo, String fechaSalida, String fechaEntrada, double precio, String destinoId) {
        this.numeroVuelo = numeroVuelo;
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
        this.precio = precio;
        this.destinoId = destinoId;
    }

    public Fly() {
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
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

    public String getDestinoId() {
        return destinoId;
    }

    public void setDestinoId(String destinoId) {
        this.destinoId = destinoId;
    }

    public PaymentMethods getPago() {
        return pago;
    }

    public void setPago(PaymentMethods pago) {
        this.pago = pago;
    }

    public void guardarVueloDB(Fly vuelo) {
        try {
            // Creamos la conexión con la base de datos
            Connection nuevaConexion = DBconexion.ConectarBD();

            // Definimos el comando con parámetros
            String comando_Insert = "INSERT INTO VUELOS (NUMEROVUELO, FECHASALIDA, FECHAENTRADA, CLASE, PRECIO, DESTINO, AEROLINEA) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement nuevoStatamentPreparado = nuevaConexion.prepareStatement(comando_Insert);

            // Definimos los parámetros del evento que recibimos como parámetro
            nuevoStatamentPreparado.setString(1, String.valueOf(vuelo.getNumeroVuelo()));
            nuevoStatamentPreparado.setString(2, String.valueOf(vuelo.getFechaSalida()));
            nuevoStatamentPreparado.setString(3, String.valueOf(vuelo.getFechaEntrada()));
            nuevoStatamentPreparado.setString(4, vuelo.getClase().getDisplayName());
            nuevoStatamentPreparado.setString(5, String.valueOf(vuelo.getPrecio()));
            nuevoStatamentPreparado.setString(6, vuelo.getDestinoId());
            nuevoStatamentPreparado.setString(7, "FideAirlines");


            nuevoStatamentPreparado.executeUpdate();

            nuevaConexion.close();
            JOptionPane.showMessageDialog(null, "El vuelo se guardó exitosamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el vuelo. Error: " + ex.getMessage());
        }
    }
}
