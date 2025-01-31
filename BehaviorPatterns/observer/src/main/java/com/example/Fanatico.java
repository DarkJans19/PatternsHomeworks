package com.example;

public class Fanatico implements Observador{
    private String nombre;

    public Fanatico(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar(String equipo){
        System.out.println(nombre + ": Vamos " + equipo + "!"); 
    }
}
