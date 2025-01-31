package com.example;

public class MediadorChatGrupo implements MediadorChat{
    @Override
    public void enviarMensaje(String mensaje, Usuario usuario){
        System.out.println("Mediador: " + usuario.getNombre() + " Envio el mensaje: " + mensaje);
    }
}
