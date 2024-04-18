/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fideairlines.Server.Entities;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author danie
 */
public class HiloCliente extends Thread {

    private JLabel MensajeServer; // Cambiado de MensajeCliente a MensajeServer
    private JTextArea MensajeCliente; // Cambiado de MensajeServer a MensajeCliente

    public JLabel getLog() {
        return MensajeServer; // Cambiado de MensajeCliente a MensajeServer
    }

    public void setLog(JLabel MensajeServer) { // Cambiado de MensajeCliente a MensajeServer
        this.MensajeServer = MensajeServer; // Cambiado de MensajeCliente a MensajeServer
    }

    public JTextArea getLog2() {
        return MensajeCliente; // Cambiado de MensajeServer a MensajeCliente
    }

    public void setLog2(JTextArea MensajeCliente) { // Cambiado de MensajeServer a MensajeCliente
        this.MensajeCliente = MensajeCliente; // Cambiado de MensajeServer a MensajeCliente
    }

    private int puerto = 10579;

    // CONSTRUCTORES
    public HiloCliente(JLabel MensajeServer, JTextArea MensajeCliente) { // Cambiado de HiloServer a HiloCliente
        this.MensajeServer = MensajeServer; // Cambiado de MensajeCliente a MensajeServer
        this.MensajeCliente = MensajeCliente; // Cambiado de MensajeServer a MensajeCliente
    }

    // GETTERS
    public int getPuerto() {
        return puerto;
    }

    // SETTERS
    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public void run() {

        ServerSocket vSocketCliente; // Cambiado de vSocketServidor a vSocketCliente
        try {
            vSocketCliente = new ServerSocket(this.puerto); // Cambiado de vSocketServidor a vSocketCliente
            while (true) {
                Socket vNuevoSocketServidor; // Cambiado de vNuevoSocketCliente a vNuevoSocketServidor
                vNuevoSocketServidor = vSocketCliente.accept(); // Cambiado de vNuevoSocketCliente a vNuevoSocketServidor
                ObjectInputStream vInputObject = new ObjectInputStream(vNuevoSocketServidor.getInputStream());
                Mensaje mensaje = (Mensaje) vInputObject.readObject();

                if ("server".equals(mensaje.getOrigen())) {
                    this.MensajeServer.setText(String.valueOf(mensaje.getMensaje())); // Cambiado de MensajeCliente a MensajeServer
                } else if ("cliente".equals(mensaje.getOrigen())) { // Cambiado de "server" a "cliente"
                    this.MensajeCliente.setText(String.valueOf(mensaje.getMensaje())); // Cambiado de MensajeServer a MensajeCliente
                }
                this.MensajeServer.setText(String.valueOf(mensaje.getMensaje())); // Cambiado de MensajeCliente a MensajeServer
                vNuevoSocketServidor.close(); // Cambiado de vNuevoSocketCliente a vNuevoSocketServidor

            }
        } catch (Exception ex) {
        }
    }
}