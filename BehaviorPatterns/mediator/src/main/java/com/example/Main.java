package com.example;

public class Main {
    public static void main(String[] args) {
        // Crear el mediador
        MediadorChat mediador = new MediadorChatGrupo();

        // Crear los usuarios
        Usuario usuario1 = new Usuario("Juan", mediador);
        Usuario usuario2 = new Usuario("Ana", mediador);
        Usuario usuario3 = new Usuario("Pedro", mediador);

        // Los usuarios envían mensajes a través del mediador
        usuario1.enviarMensaje("Hola a todos!");
        usuario2.enviarMensaje("¿Cómo están?");
        usuario3.enviarMensaje("¡Hola Juan y Ana!");
    }
}