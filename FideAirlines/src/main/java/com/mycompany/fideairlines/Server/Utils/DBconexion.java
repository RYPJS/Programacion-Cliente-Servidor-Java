/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fideairlines.Server.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kenda
 */
public class DBconexion {

    private static final String servidor = "localhost";
    private static final String schema = "eventos";
    private static final String usuario = "root";
    private static final String contrasena = "admin";
    private static final String driver = "jdbc:mysql";

    public static Connection ConectarBD() {

        Connection conexion = null;

        try {
            //CREAMOS LA CONEXION CON LA BD
            conexion = DriverManager.getConnection(
                    driver + "://" + servidor + "/" + schema + "?serverTimezone=UTC", usuario, contrasena);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        } finally {
            return conexion;
        }
    }
}
