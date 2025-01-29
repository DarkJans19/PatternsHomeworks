package com.example;

public class ProxyImagen implements	Imagen{
    private String nombreArchivo;
    private ImagenReal imagenReal;

    // Constructor
    public ProxyImagen(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    // Implementamos el metodo mostrar
    @Override
    public void mostrar(){
        if (imagenReal == null){
            // Aqui solo se crea la imagen cuando es necesario
            imagenReal = new ImagenReal(nombreArchivo);
        }
        // Delega la llamada a la imagen real
        imagenReal.mostrar();
    }
}
