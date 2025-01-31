package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("Manzana", "Banana", "Cereza", "Toronja", "Tomate", "Kiwi");
        Coleccion coleccion = new Coleccion(frutas);

        Iterator iterador = coleccion.crearIterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}