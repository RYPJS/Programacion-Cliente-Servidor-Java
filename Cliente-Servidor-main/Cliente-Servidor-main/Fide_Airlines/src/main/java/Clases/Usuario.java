package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aaron
 */
public class Usuario {
    private int id;
    private String nombre_Usuario;
    private String cedula;
    private String correo;
    private String contrasenia;
    private String fechaNacimiento;
    private int idPreferencias;
    private int idReservas;
    private int tipo_Usuario;
    private boolean estado;

    public Usuario() {
    }

    public Usuario(int id, String nombre_Usuario, String cedula, String correo, String contrasenia, String fechaNacimiento, int idPreferencias, int idReservas, int tipo_Usuario, boolean estado) {
        this.id = id;
        this.nombre_Usuario = nombre_Usuario;
        this.cedula = cedula;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.fechaNacimiento = fechaNacimiento;
        this.idPreferencias = idPreferencias;
        this.idReservas = idReservas;
        this.tipo_Usuario = tipo_Usuario;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdPreferencias() {
        return idPreferencias;
    }

    public void setIdPreferencias(int idPreferencias) {
        this.idPreferencias = idPreferencias;
    }

    public int getIdReservas() {
        return idReservas;
    }

    public void setIdReservas(int idReservas) {
        this.idReservas = idReservas;
    }

    public int getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(int tipo_Usuario) {
        this.tipo_Usuario = tipo_Usuario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //CRUD USER
    public static void CrearUsuario()
    {
      //Codigo   
    }
    
    public static void BuscarIdUsuario()
    {
      //Codigo   
    }
    
    public static void BuscarTodosUsuario()
    {
      //Codigo   
    }
    
    public static void ActualizarUsuario()
    {
      //Codigo   
    }
    
    //Eliminado Logico
    public static void EliminarUsuario()
    {
      //Codigo   
    }
    
}
