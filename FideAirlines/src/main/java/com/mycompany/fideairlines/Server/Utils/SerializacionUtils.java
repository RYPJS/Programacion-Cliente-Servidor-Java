/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fideairlines.Server.Utils;
import com.mycompany.fideairlines.Server.Entities.Passager;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author kenda
 */

public class SerializacionUtils {

    public static void guardarPassager(String nombreArchivo, Passager pasajero) {
        try (FileOutputStream fos = new FileOutputStream(nombreArchivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Escribir el objeto Passager en el archivo
            oos.writeObject(pasajero);

            System.out.println("Pasager guardado en " + nombreArchivo);
        } catch (IOException ex) {
            System.err.println("Error al guardar el pasajero: " + ex.getMessage());
        }
    }
}