package com.example;

public class CambiarCanal implements Command{
    private Televisor televisor;
    private int canal;

    public CambiarCanal(Televisor televisor, int canal){
        this.televisor = televisor;
        this.canal = canal;
    }

    @Override
    public void ejecutar(){
        televisor.cambiarCanal(canal);
    }
}
