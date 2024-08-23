/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principios;

/**
 *
 * @author Jan Sanchez
 */
// Esta clase llama a la clase Libro y se encarga de generar un informe en PDF
public class PDFGenerator {
    public void generarPDF(Libro libro){
        System.out.println("Generando informe PDF para el libro: " + libro.getTitulo());
    }
}
