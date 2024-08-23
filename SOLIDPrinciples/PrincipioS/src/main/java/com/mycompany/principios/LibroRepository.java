/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principios;

/**
 *
 * @author Jan Sanchez
 */
// Este codigo llama a la clase libro y se encarga de guardar el libro en la base de datos reduciendo asi su funcionalidad solo en una clase
public class LibroRepository {
    public void guardar(Libro libro){
        System.out.println("Guardando en la base de datos...");
    }
}
