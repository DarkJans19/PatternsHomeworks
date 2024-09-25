package com.example;

public class EnvioAire implements IEnvio{
    @Override
    public void procesarEntrega() {
        // TODO Auto-generated method stub
        System.out.println("El paquete se ha cargado en el avion.");
    }

    @Override
    public void enviar() {
        // TODO Auto-generated method stub
        System.out.println("El paquete va volando por el aire.");    
    }

    @Override
    public void procesarEnvio() {
        // TODO Auto-generated method stub
        System.out.println("El paquete se ha descargado en el aeropuerto");
    }

}