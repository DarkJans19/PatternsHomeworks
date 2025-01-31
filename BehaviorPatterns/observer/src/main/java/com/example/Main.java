package com.example;

public class Main {
    public static void main(String[] args) {
        // Crear el partido de fútbol
        PartidoDeFutbol partido = new PartidoDeFutbol();

        // Crear algunos fanáticos
        Fanatico fan1 = new Fanatico("Juan");
        Fanatico fan2 = new Fanatico("Ana");

        // Agregar los fanáticos como observadores
        partido.agregarObservador(fan1);
        partido.agregarObservador(fan2);

        // Hacer un gol y ver cómo los fanáticos reaccionan
        partido.hacerGol("Argentina");
        partido.hacerGol("Brasil");
    }
}