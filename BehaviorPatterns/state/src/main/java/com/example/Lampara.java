package com.example;

public class Lampara {
    private EstadoLampara estado;

    public Lampara(){
        this.estado = new EstadoApagado();
    }

    public void setEstado(EstadoLampara estado){
        this.estado = estado;
    }

    public void presionarBoton(){
        estado.presionarBoton(this);
    }
}
