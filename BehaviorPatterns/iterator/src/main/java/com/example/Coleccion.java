package com.example;
import java.util.List;

public class Coleccion {
    private List<String> elementos;

    public Coleccion(List<String> elementos){
        this.elementos = elementos;
    }

    public Iterator crearIterator(){
        return new IteradorDeColeccion(this.elementos);
    }
}
