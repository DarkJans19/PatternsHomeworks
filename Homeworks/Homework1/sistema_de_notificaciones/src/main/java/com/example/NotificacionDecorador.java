package com.example;

public abstract class NotificacionDecorador implements Notificacion {
    protected Notificacion notificacionDecorada;

    public NotificacionDecorador(Notificacion notificacionDecorada) {
        this.notificacionDecorada = notificacionDecorada;
    }
}
