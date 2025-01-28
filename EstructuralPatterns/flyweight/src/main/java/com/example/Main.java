package com.example;

public class Main {
    public static void main(String[] args) {
        // Creamos un bosque
        Forest forest = new Forest();

        // Plantamos algunos árboles
        forest.plantTree(1, 2, "Roble", "Verde", "Rugosa");
        forest.plantTree(3, 4, "Pino", "Verde Oscuro", "Lisa");
        forest.plantTree(5, 6, "Roble", "Verde", "Rugosa"); // Reutiliza el tipo "Roble"
        forest.plantTree(7, 8, "Abeto", "Verde Claro", "Espinosa");

        // Dibujamos el bosque
        forest.drawForest();
    }
}