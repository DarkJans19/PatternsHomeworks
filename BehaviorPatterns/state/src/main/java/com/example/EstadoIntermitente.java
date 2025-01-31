package com.example;

public class EstadoIntermitente implements EstadoLampara{
    @Override 
    public void presionarBoton(Lampara lampara){
        System.out.println("La lampara se apaga");
        lampara.setEstado(new EstadoApagado());
    }
}
