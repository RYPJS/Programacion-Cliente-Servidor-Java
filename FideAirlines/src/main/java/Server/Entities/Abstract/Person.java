package Server.Entities.Abstract;

import Server.Utils.Gender;

import java.util.Date;

public abstract class Person {
    private int id;
    private String nombre;
    private String email;
    private String contrasena;
    private Date fechaNacimiento;
    private Gender genero;
    private String pais;
    private String numeroTelefono;

    // Constructor
    public Person(int id, String nombre, String email, String contrasena, Date fechaNacimiento, Gender genero, String pais, String numeroTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.pais = pais;
        this.numeroTelefono = numeroTelefono;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Gender getGenero() {
        return genero;
    }

    public void setGenero(Gender genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}