/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fideairlines.Server.Entities;

import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author kenda
 */
public class HiloServidor extends Thread {

    private JLabel MensajeCliente;
    private JTextArea MensajeServer;

    public JLabel getLog() {
        return MensajeCliente;
    }

    public void setLog(JLabel MensajeCliente) {
        this.MensajeCliente = MensajeCliente;
    }

    public JTextArea getLog2() {
        return MensajeServer;
    }

    public void setLog2(JTextArea MensajeServer) {
        this.MensajeServer = MensajeServer;
    }

    private int puerto = 10578;

//CONSTRUCTORES
    public HiloServidor(JLabel MensajeCliente, JTextArea MensajeServer) {
        this.MensajeCliente = MensajeCliente;
        this.MensajeServer = MensajeServer;
    }

//GETTERS
    public int getPuerto() {
        return puerto;
    }

//SETTERS
    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public void run() {

        ServerSocket vSocketServidor;
        try {
            vSocketServidor = new ServerSocket(this.puerto);
            while (true) {
                Socket vNuevoSocketCliente;
                vNuevoSocketCliente = vSocketServidor.accept();
                ObjectInputStream vInputObject = new ObjectInputStream(vNuevoSocketCliente.getInputStream());
                Mensaje mensaje = (Mensaje) vInputObject.readObject();
                
                if ("cliente".equals(mensaje.getOrigen())) {
                    this.MensajeCliente.setText(String.valueOf(mensaje.getMensaje()));
                } else if ("server".equals(mensaje.getOrigen())) {
                    this.MensajeServer.setText(String.valueOf(mensaje.getMensaje()));
                }
                this.MensajeCliente.setText(String.valueOf(mensaje.getMensaje()));
                vNuevoSocketCliente.close();

            }
        } catch (Exception ex) {
        }
    }
}
