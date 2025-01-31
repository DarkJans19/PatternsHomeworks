package com.example;
import java.util.List;
public class IteradorDeColeccion implements Iterator{
    private List<String> elementos;
    private int posicion = 0;

    public IteradorDeColeccion(List<String> elementos){
        this.elementos = elementos;
    }

    @Override
    public boolean hasNext(){
        return posicion < elementos.size();
    }

    @Override
    public Object next(){
        if (this.hasNext()){
            return elementos.get(posicion++);
        }
        return null;
    }
}
