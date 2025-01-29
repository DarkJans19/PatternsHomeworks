package com.example;

public class ImagenReal implements Imagen{
    private String nombreArchivo;

    public ImagenReal(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
        cargarDesdeDisco();
    }

    private void cargarDesdeDisco() {
        System.out.println("Cargando imagen en tamaño completo: " + nombreArchivo);
        // Simulación de una carga lenta
        try {
            Thread.sleep(2000); // Simula un retraso de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // Metodo para mostrar la imagen
    @Override
    public void mostrar(){
        System.out.println("Mostrando imagen en tamaño completo: " + nombreArchivo);
    }
}
