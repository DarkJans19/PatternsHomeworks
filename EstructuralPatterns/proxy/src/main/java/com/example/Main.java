package com.example;

public class Main {
    public static void main(String[] args) {
        // Lista de miniaturas (proxies)
        Imagen[] galeria = {
            new ProxyImagen("foto1.jpg"),
            new ProxyImagen("foto2.jpg"),
            new ProxyImagen("foto3.jpg")
        };

        // Simulación de interacción del usuario
        System.out.println("Mostrando miniaturas...");
        for (Imagen imagen : galeria) {
            System.out.println("Miniatura de: " + ((ProxyImagen) imagen).getNombreArchivo());
        }

        // El usuario hace clic en una miniatura
        // Aqui en vez de colocar la impresion podriamos agregar la logica de la interaccion del usuario con la imagen
        System.out.println("\nUsuario hace clic en la miniatura de foto1.jpg");
        galeria[0].mostrar(); // La imagen se carga y se muestra

        // Aqui en vez de colocar la impresion podriamos agregar la logica de la interaccion del usuario con la imagen
        System.out.println("\nUsuario hace clic en la miniatura de foto2.jpg");
        galeria[1].mostrar(); // La imagen se carga y se muestra
    }
}