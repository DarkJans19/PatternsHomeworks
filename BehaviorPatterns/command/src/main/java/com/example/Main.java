package com.example;

public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();

        //Creamos los comandos
        Command encender = new EncenderTelevisor(televisor);
        // Aqui se puede agregar un imput para poder escoger el numero del canal
        Command cambiarCanal = new CambiarCanal(televisor, 5);

        ControlRemoto controlRemoto = new ControlRemoto();

        // Asignamos el comando de encender y presionar el boton
        controlRemoto.setComando(encender);
        controlRemoto.presionarBoton();

        controlRemoto.setComando(cambiarCanal);
        controlRemoto.presionarBoton();
    }
}