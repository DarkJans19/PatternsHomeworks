package com.example;

import java.util.ArrayList;
import java.util.List;

public class PartidoDeFutbol {
    private List<Observador> observadores = new ArrayList<>();
    private String equipo;

    public void agregarObservador(Observador observador){
        observadores.add(observador);
    }

    public void quitarObservador(Observador observador){
        observadores.remove(observador);
    }

    public void notificarObservadores(){
        for(Observador observador : observadores){
            observador.actualizar(equipo);
        }
    }

    public void hacerGol(String equipo){
        this.equipo = equipo;
        System.out.println("Gol de: " + equipo + "!");
        notificarObservadores();
    }
}
