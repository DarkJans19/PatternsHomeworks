package com.example;

public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única del GestorNotificaciones
        GestorNotificaciones gestor = GestorNotificaciones.getInstancia();

        // Crear notificaciones
        Notificacion notificacionEmail = new NotificacionPorEmail("ejemplo@correo.com");
        Notificacion notificacionSMS = new NotificacionSMS("1234567890");

        // Decorar notificaciones
        Notificacion notificacionEmailConCifrado = new NotificacionConCifrado(notificacionEmail);
        Notificacion notificacionSMSConFirma = new NotificacionConFirma(notificacionSMS);

        // Enviar notificaciones
        gestor.enviarNotificacion(notificacionEmailConCifrado, "Hola, este es un mensaje cifrado por email.");
        gestor.enviarNotificacion(notificacionSMSConFirma, "Hola, este es un mensaje con firma por SMS.");
    }
}