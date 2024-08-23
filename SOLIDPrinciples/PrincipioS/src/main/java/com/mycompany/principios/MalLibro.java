/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principios;

/**
 *
 * @author Jan Sanchez
 */

/* Este codigo viola el principio de responsabilidad unica puesto que la clase malLibro (La llame asi a proposito con el fin de que 
se note que no esta hecha correctamente) esta haciendo 3 funciones a la vez, las cuales son obtener los datos del libro en los metodos
getter, luego guardando en la base de datos y luego imprimiendo el PDF y tambien viola el principio de open closed puesto que si se 
quiere hacer una modificacion al codigo del como se imprime el pdf o como se guarda el libro en la base de datos hay que cambiar 
el codigo de la clase*/

public class MalLibro {
    private String titulo;
    private String autor;
    
    // Constructor
    public MalLibro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    // Metodos getter para recibir la informacion del libro
    public String getLibro(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    // Metodo que guarda los libros en la base de datos
    public void guardarEnBaseDeDatos(){
        System.out.println("Guardando libro en la base de datos... ");
    }
    // Metodo que genera el PDF de los libros
    public void generarPDF(){
        System.out.println("Generando PDF... ");
    }
}
