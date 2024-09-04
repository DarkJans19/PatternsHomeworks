/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author Jan Sanchez
 */
public class AdapterIphoneCharger implements Charger{
    IphoneCharger iphoneCharger;
    
    AdapterIphoneCharger(){
        iphoneCharger = new IphoneCharger();
    }
    @Override
    public void charge(){
        iphoneCharger.charge();
    }
}
