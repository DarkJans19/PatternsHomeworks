package com.example;

public class EncenderTelevisor implements Command{
    private Televisor televisor;

    public EncenderTelevisor(Televisor televisor){
        this.televisor = televisor;
    }

    @Override
    public void ejecutar(){
        televisor.encender();
    }
}
