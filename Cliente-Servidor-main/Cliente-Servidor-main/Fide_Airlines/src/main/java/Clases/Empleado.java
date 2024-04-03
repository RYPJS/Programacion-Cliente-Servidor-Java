/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Aaron
 */
public class Empleado extends Usuario{

    public Empleado() {
    }

    public Empleado(int id, String nombre_Usuario, String cedula, String correo, String contrasenia, String fechaNacimiento, int idPreferencias, int idReservas, int tipo_Usuario, boolean estado) {
        super(id, nombre_Usuario, cedula, correo, contrasenia, fechaNacimiento, idPreferencias, idReservas, tipo_Usuario, estado);
    }

}
