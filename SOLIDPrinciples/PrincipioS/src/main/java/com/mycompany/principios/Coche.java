/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principios;

/**
 *
 * @author Estudiantes
 */
class Coche {  
    String marca;

    public Coche(String marca){
        this.marca = marca; 
    }

    String getMarcaCoche(){ return marca; }
}

class CocheDB{  
    void guardarCocheDB(Coche coche){
    }
    void eliminarCocheDB(Coche coche){
    }
}