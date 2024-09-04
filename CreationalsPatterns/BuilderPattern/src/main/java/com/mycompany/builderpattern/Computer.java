/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builderpattern;

/**
 *
 * @author Jan Sanchez
 */

public class Computer {
    public static class ComputerBuilder{
        private String HDD;
        private String RAM;
        
        private boolean tieneTarjetaGrafica;
        private boolean isBluetoothEnabled;
        
        public ComputerBuilder(String HDD, String RAM){
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setTieneTarjetaGrafica(boolean tieneTarjetaGrafica) {
            this.tieneTarjetaGrafica = tieneTarjetaGrafica;
            return this;
        }

        public ComputerBuilder setIsBluetoothEnabled(boolean isBluehoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        
        public Computer build(){
            return new Computer(this);
        }
    }
    // Parametros obligatorios
    private String HDD;
    private String RAM;
    
    //Parametros opcionales
    private boolean tieneTarjetaGrafica;
    private boolean isBluetoothEnabled;

    
    // Getters
    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }


    public boolean isTieneTarjetaGrafica() {
        return tieneTarjetaGrafica;
    }

    public boolean isIsBluethoothEnabled() {
        return isBluetoothEnabled;
    }
    // Constructor
    public Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.tieneTarjetaGrafica = builder.tieneTarjetaGrafica;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }
}
