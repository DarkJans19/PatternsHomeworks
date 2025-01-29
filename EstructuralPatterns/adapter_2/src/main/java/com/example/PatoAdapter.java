package com.example;

public class PatoAdapter implements Pajaro{
    private Pato pato;

    // Constructor
    public PatoAdapter(Pato pato){
        this.pato = pato;
    }

    @Override
    public void cantar(){
        // Adaptamos el canto del pajaro como un graznido
        pato.graznar();
    }

    @Override
    public void volar(){
        // Lo dejamos como volar puesto que no necesita ningun cambio
        pato.volar();
    }
}
