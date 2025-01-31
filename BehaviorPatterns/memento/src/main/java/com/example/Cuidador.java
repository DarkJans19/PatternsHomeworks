package com.example;

public class Cuidador {
    private Memento memento;

    public void guardarMemento(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return memento;
    }
}
