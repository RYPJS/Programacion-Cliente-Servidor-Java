package com.mycompany.fideairlines.Server.Entities;

import com.mycompany.fideairlines.Server.Abstract.Person;
import com.mycompany.fideairlines.Server.Utils.DBconexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Admin extends Person {

    private int numeroEmpleado;

    public Admin() {
    }

    public Admin(int numeroEmpleado, String nombre, String email, String contrasena, String numeroTelefono) {
        super(nombre, email, contrasena, numeroTelefono);
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public void crearEmpleado(Admin admin) {
        try {
            // Creamos la conexión con la base de datos
            Connection nuevaConexion = DBconexion.ConectarBD();

            // Definimos el comando con parámetros
            String comando_Insert = "INSERT INTO empleados (NOMBRE, EMAIL, CONTRASENA, NUMEROTELEFONO, NUMEROEMPLEADO) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement nuevoStatamentPreparado = (PreparedStatement) nuevaConexion.prepareStatement(comando_Insert);

            // Definimos los parámetros del evento que recibimos como parámetro
            nuevoStatamentPreparado.setString(1, admin.getNombre());
            nuevoStatamentPreparado.setString(2, admin.getEmail());
            nuevoStatamentPreparado.setString(3, admin.getContrasena());
            nuevoStatamentPreparado.setString(4, admin.getNumeroTelefono());
            nuevoStatamentPreparado.setString(5, String.valueOf(admin.getNumeroEmpleado()));

            nuevoStatamentPreparado.executeUpdate();

            nuevaConexion.close();
            JOptionPane.showMessageDialog(null, "Se creo su cuenta");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo craar la cuenta. Error: " + ex.getMessage());

        }
    }

    public boolean buscarEmpleado(Admin admin) {
        boolean clienteEncontrado = false;
        try {
            Connection nuevaConexion = DBconexion.ConectarBD();

            String comandoSelect = "SELECT * FROM empleados WHERE NOMBRE = ? OR EMAIL = ? OR NUMEROEMPLEADO = ?";
            PreparedStatement nuevoStatementPreparado = nuevaConexion.prepareStatement(comandoSelect);
            nuevoStatementPreparado.setString(1, admin.getNombre());
            nuevoStatementPreparado.setString(2, admin.getEmail());
            nuevoStatementPreparado.setString(3, String.valueOf(admin.getNumeroEmpleado()));

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

}
