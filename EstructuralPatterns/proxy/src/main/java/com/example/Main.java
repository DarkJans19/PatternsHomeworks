package com.example;

public class Main {
    public static void main(String[] args) {
        // Creamos un proxy para la imagen
        Imagen imagen = new ProxyImagen("foto1.jpg");

        // La imagen no se carga hasta que se llama a mostrar()
        imagen.mostrar();

        // La imagen ya está cargada, no se carga de nuevo
        imagen.mostrar();
    }
}