/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principioi;

/**
 *
 * @author Jan Sanchez
 */
public class Rectangulo extends Figura{
    private double ancho;
    private double alto;
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public double calcularArea(){
        return ancho * alto;
    }
}