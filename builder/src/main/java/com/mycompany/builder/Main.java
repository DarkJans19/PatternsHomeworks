/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.builder;

/**
 *
 * @author Jan Sanchez
 */
public class Main {
    
    // Crea un objeto utilizando el builder para que sea mas facil crearlo
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setIsBluetoothEnabled(true).setTieneTarjetaGrafica(true).build();
        System.out.println(comp.getHDD());
        System.out.println(comp.getRAM());
    }
}
