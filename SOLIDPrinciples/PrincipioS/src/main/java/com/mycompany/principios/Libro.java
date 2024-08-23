/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principios;

/**
 *
 * @author Jan Sanchez
 */

// Esta clase se encarga de recibir la informacion del libro
public class Libro {
    private String titulo;
    private String autor;
    
    // Constructor
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // Metodos Getter para recibir la informacion del libro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
}
