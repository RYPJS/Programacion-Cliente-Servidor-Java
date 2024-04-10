package com.mycompany.fideairlines.Server.Entities;

public class Chat {
    private Passager emisor;
    private String mensaje;
    private int clienteId;

    public Chat(Passager emisor, String mensaje, int clienteId) {
        this.emisor = emisor;
        this.mensaje = mensaje;
        this.clienteId = clienteId;
    }

    public Passager getEmisor() {
        return emisor;
    }

    public void setEmisor(Passager emisor) {
        this.emisor = emisor;
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
