package Server.Entities.Class;

public class Chat {
    private int id;
    private String mensaje;
    private int clienteId;

    // Constructor
    public Chat(int id, String mensaje, int clienteId) {
        this.id = id;
        this.mensaje = mensaje;
        this.clienteId = clienteId;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
}
