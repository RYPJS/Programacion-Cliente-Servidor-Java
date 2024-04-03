/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Aaron
 */
public class Cliente extends Usuario{
    private int idPreferencias;
    private int idReservas;

    public Cliente() {
    }

    public Cliente(int idPreferencias, int idReservas) {
        this.idPreferencias = idPreferencias;
        this.idReservas = idReservas;
    }

    @Override
    public int getIdPreferencias() {
        return idPreferencias;
    }

    @Override
    public void setIdPreferencias(int idPreferencias) {
        this.idPreferencias = idPreferencias;
    }

    @Override
    public int getIdReservas() {
        return idReservas;
    }

    @Override
    public void setIdReservas(int idReservas) {
        this.idReservas = idReservas;
    }
}
