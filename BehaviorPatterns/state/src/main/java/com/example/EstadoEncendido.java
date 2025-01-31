package com.example;

public class EstadoEncendido implements EstadoLampara{
    @Override
    public void presionarBoton(Lampara lampara){
        System.out.println("La lampara ahora parpadea");
        lampara.setEstado(new EstadoIntermitente());
    }
}
