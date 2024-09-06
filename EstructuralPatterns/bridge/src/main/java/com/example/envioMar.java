package com.example;

public class EnvioMar implements IEnvio{
    @Override
    public void procesarEnvio(){
        System.out.println("El paquete se ha cargado en el barco");
    }

    @Override
    public void enviar(){
        System.out.println("El paquete va navegando por el mar");
    }

    @Override
    public void procesarEntrega(){
        System.out.println("El paquete se ha descargado en el puerto");
    }
}
