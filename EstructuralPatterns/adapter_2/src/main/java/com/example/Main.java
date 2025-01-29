package com.example;

public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato();

        // Adaptamos el pato a la interfaz de pajaro
        Pajaro patoAdaptado = new PatoAdapter(pato);

        // Usar el pato adaptado como si fuera un Pajaro
        patoAdaptado.cantar(); // Salida: Graznando como un pato
        patoAdaptado.volar();  // Salida: Volando como un pato
    }
}