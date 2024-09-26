package com.example;

public class NotificacionPorEmail implements Notificacion {
    private String direccionEmail;

    public NotificacionPorEmail(String direccionEmail) {
        this.direccionEmail = direccionEmail;
    }

    // Implementación del método enviar de la interfaz Notificacion
    @Override
    public void enviar(String mensaje) {
        // Simulación del envío del correo
        System.out.println("Enviando email a: " + direccionEmail);
        System.out.println("Mensaje: " + mensaje);
    }
}