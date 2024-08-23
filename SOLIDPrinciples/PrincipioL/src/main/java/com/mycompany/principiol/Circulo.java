/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiol;

/**
 *
 * @author Jan Sanchez
 */
public class Circulo extends Figura{
    private double radio;
    public Circulo(int radio){
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
}
