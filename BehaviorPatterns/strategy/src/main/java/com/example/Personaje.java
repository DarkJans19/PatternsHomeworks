package com.example;

public class Personaje {
    private EstrategiaAtaque estrategia;

    // Le ponemos una estrategia al personaje
    public void setEstrategia(EstrategiaAtaque estrategia){
        this.estrategia = estrategia;
    }

    public void atacar(){
        if(estrategia != null){
            estrategia.atacar();
        }
        else{
            System.out.println("No se puede atacar");
        }
    }
}
