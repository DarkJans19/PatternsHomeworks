package com.example;

// Implementación concreta para Notificación por Email
public class NotificacionPorEmail implements Notificacion {

    // Atributo para almacenar la dirección de correo electrónico
    private String direccionEmail;

    // Constructor que inicializa la dirección de correo electrónico
    public NotificacionPorEmail(String direccionEmail) {
        this.direccionEmail = direccionEmail;
    }

    // Implementación del método enviar de la interfaz Notificacion
    @Override
    public void enviar(String mensaje) {
        // Simulación del envío del email
        System.out.println("Enviando email a: " + direccionEmail);
        System.out.println("Mensaje: " + mensaje);
    }
}