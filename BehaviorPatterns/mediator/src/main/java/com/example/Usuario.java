package com.example;

public class Usuario {
    private String nombre;
    private MediadorChat mediador;

    public Usuario(String nombre, MediadorChat mediador){
        this.nombre = nombre;
        this.mediador = mediador;
    }

    public String getNombre(){
        return nombre;
    }

    public void enviarMensaje(String mensaje){
        // El usuario le envia el mensaje al mediador
        mediador.enviarMensaje(mensaje, this);
    }
}
