package com.example;

class ProxyImagen implements Imagen {
    private String nombreArchivo; // Campo privado
    private ImagenReal imagenReal;

    public ProxyImagen(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    // Método getter para acceder al nombreArchivo
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    // Implementamos el metodo mostrar
    @Override
    public void mostrar() {
        if (imagenReal == null) {
            imagenReal = new ImagenReal(nombreArchivo);
        }
        imagenReal.mostrar();
    }
}