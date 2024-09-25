package com.example;

public class NotificacionConFirma extends NotificacionDecorador {

    public NotificacionConFirma(Notificacion notificacionDecorada) {
        super(notificacionDecorada);
    }

    @Override
    public void enviar(String mensaje) {
        String mensajeConFirma = agregarFirma(mensaje);
        notificacionDecorada.enviar(mensajeConFirma);
    }

    private String agregarFirma(String mensaje) {
        // Agrega una firma al mensaje
        return mensaje + "\n-- Enviado desde mi aplicación";
    }
}

