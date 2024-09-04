/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author Jan Sanchez
 */
public class IphoneCharger implements Charger{
    IphoneCharger(){}
    @Override
    public void charge(){
        System.out.println("Charging with iphone charger");
    }
    
}
