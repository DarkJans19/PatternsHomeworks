package com.example;

public abstract class Cajero {
    protected Cajero siguiente;

    public void setSiguiente(Cajero siguiente){
        this.siguiente = siguiente;
    }

    public abstract void dispensar(int cantidad);
}
