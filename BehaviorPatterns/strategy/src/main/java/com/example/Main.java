package com.example;

public class Main {
    public static void main(String[] args) {
        Personaje heroe = new Personaje();

        // Usamos la espada
        heroe.setEstrategia(new AtaqueEspada());
        heroe.atacar(); // Salida: ¡Corte con espada!

        // Cambiamos al arco
        heroe.setEstrategia(new AtaqueArco());
        heroe.atacar(); // Salida: ¡Flecha disparada!

        // Cambiamos al bastón mágico
        heroe.setEstrategia(new AtaqueBaston());
        heroe.atacar(); // Salida: ¡Hechizo lanzado!
    }
}