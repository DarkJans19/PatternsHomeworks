package com.example;

public class NotificacionSMS implements Notificacion {
    private String numeroDeTelefono;

    public NotificacionSMS(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    // Implementa metodo enviar
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje al número: " + numeroDeTelefono);
        System.out.println("Mensaje: " + mensaje);
    }
}
