package com.example;

public class Main {
    public static void main(String[] args) {
        Juguete juguete = new Juguete();
        Cuidador cuidador = new Cuidador();

        // Cambiamos el estado del juguete
        juguete.setEstado("Estado 1");
        System.out.println("Estado actual: " + juguete.getEstado());

        // Guardamos el estado
        cuidador.guardarMemento(juguete.guardarEstado());

        // Cambiamos el estado otra vez
        juguete.setEstado("Estado 2");
        System.out.println("Estado actual: " + juguete.getEstado());

        //Restauramos el estado anterior
        juguete.restaurarEstado(cuidador.getMemento());
        System.out.println("Estado restaurado: " + juguete.getEstado());
    }
}