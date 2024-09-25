package com.example;

public class Main {
    public static void main(String[] args) {
        EmpresaMensajeria mensajeria = new EuroTransport("15321354");

        // Hacer la primera entrega
        mensajeria.recogerPaquete();
        mensajeria.enviarPaquete();
        mensajeria.entregarPaquete();

        // Ahora cambiamos los valores para enviar por mar
        mensajeria.setEnvio(new EnvioMar());
        mensajeria.recogerPaquete();
        mensajeria.enviarPaquete();
        mensajeria.entregarPaquete();

        //Ahora cambiamos los valores para enviar por mar
        mensajeria.setEnvio(new EnvioTierra());
        mensajeria.recogerPaquete();
        mensajeria.enviarPaquete();
        mensajeria.entregarPaquete();
    }
}