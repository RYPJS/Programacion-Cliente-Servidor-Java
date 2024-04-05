package Server.Entities.Class;

import Server.Entities.Abstract.Person;

import java.util.Date;

public class Admin extends Person {
    private int numeroEmpleado;
    public Admin(int id, String nombre, String email, String contrasena, Date fechaNacimiento, String genero, String pais, String numeroTelefono, int numeroEmpleado) {
        super(id, nombre, email, contrasena, fechaNacimiento, genero, pais, numeroTelefono);
        this.numeroEmpleado = numeroEmpleado;
    }

    // Getters y setters
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
}
