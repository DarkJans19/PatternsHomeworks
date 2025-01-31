package com.example;

public class Juguete {
    private String estado;

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getEstado(){
        return estado;
    }

    // Tomamos una "Captura" del estado actual
    public Memento guardarEstado(){
        return new Memento(estado);
    }

    // Restauramos el estado guardado
    public void restaurarEstado(Memento memento){
        estado = memento.getEstado();
    }
}
