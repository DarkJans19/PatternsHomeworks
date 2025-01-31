package com.example;

public class EstadoApagado implements EstadoLampara{
    @Override
    public void presionarBoton(Lampara lampara) {
        System.out.println("La lampara se enciende.");
        lampara.setEstado(new EstadoEncendido());
    }
}
