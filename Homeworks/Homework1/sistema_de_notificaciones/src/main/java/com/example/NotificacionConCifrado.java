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

    //Este metodo simula el cifrado del mensaje pero en este caso solo esta revertiendo la cadena
    private String cifrarMensaje(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }
}
