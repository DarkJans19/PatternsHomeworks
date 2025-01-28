package com.example;

public class ImagenReal implements Imagen{
    private String nombreArchivo;

    public ImagenReal(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
        cargarDesdeDisco();
    }

    // Metodo para cargar la imagen desde el disco
    public void cargarDesdeDisco(){
        System.out.println("Cargando imagen: " + nombreArchivo);
    }

    // Metodo para mostrar la imagen
    @Override
    public void mostrar(){
        System.out.println("Mostrando imagen: " + nombreArchivo);
    }
}
