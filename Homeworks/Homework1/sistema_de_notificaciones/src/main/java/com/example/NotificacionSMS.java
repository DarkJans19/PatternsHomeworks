package com.example;

public class NotificacionSMS implements Notificacion {
    private String numeroDeTelefono;

    // Constructor que inicializa el número de teléfono
    public NotificacionSMS(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    // Implementación del método enviar de la interfaz Notificaciones
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje al número: " + numeroDeTelefono);
        System.out.println("Mensaje: " + mensaje);
    }
}
