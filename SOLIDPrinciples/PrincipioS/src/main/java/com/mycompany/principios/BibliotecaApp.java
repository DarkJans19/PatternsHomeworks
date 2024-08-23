/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.principios;

/**
 *
 * @author Jan Sanchez
 */
public class BibliotecaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto libro
        Libro libro = new Libro("Inferno", "Dan Brown");
        //Guardamos el libro en la base de datos
        LibroRepository libroRepository = new LibroRepository();
        libroRepository.guardar(libro);
        //Generamos el informe del libro
        PDFGenerator pdf = new PDFGenerator();
        pdf.generarPDF(libro);
    }
    
}
