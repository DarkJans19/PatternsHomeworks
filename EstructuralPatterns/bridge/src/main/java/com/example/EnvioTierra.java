package com.example;

public class EnvioTierra implements  IEnvio{

    @Override
    public void procesarEntrega() {
        System.out.println("El paquete se ha cargado en el carro");
    }

    @Override
    public void enviar() {
        System.out.println("El paquete esta viajando por tierra");
    }

    @Override
    public void procesarEnvio() {
        System.out.println("El paquete se ha descargado en la bodega");
    }

}
