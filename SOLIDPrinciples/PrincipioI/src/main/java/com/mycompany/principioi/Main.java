/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principioi;

/**
 *
 * @author Jan Sanchez
 */
public class Main {

    public static void main(String[] args) {
        Figura figura1 = new Circulo(1);
        Figura figura2 = new Rectangulo(1, 1);
        
        System.out.println("Area de la figura 1: " + figura1.calcularArea());
        System.out.println("Area de la figura 2: " + figura2.calcularArea());
    }
}

