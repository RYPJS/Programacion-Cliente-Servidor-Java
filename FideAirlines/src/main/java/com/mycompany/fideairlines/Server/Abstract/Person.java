package com.mycompany.fideairlines.Server.Abstract;

public abstract class Person {
    private String nombre;
    private String email;
    private String contrasena;
    private String numeroTelefono;

    public Person() {
    }

    public Person(String nombre, String email, String contrasena, String numeroTelefono) {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.numeroTelefono = numeroTelefono;
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

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }


}