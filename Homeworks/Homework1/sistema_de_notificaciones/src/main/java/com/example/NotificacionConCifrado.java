package com.example;

public class NotificacionConCifrado extends NotificacionDecorador {

    public NotificacionConCifrado(Notificacion notificacionDecorada) {
        super(notificacionDecorada);
    }

    @Override
    public void enviar(String mensaje) {
        String mensajeCifrado = cifrarMensaje(mensaje);
        notificacionDecorada.enviar(mensajeCifrado);
    }

    private String cifrarMensaje(String mensaje) {
        // Simula el cifrado del mensaje (aquí solo se invierte el mensaje para simplificar)
        return new StringBuilder(mensaje).reverse().toString();
    }
}
