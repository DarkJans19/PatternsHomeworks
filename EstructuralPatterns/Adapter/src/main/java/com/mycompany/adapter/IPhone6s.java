/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author Jan Sanchez
 */
public class IPhone6s implements IPhone{
    Charger AdapterIphoneCharger;
    public IPhone6s(Charger adapterIphoneCharger){
        this.AdapterIphoneCharger = adapterIphoneCharger;
    }
    
    @Override
    public void onCharge(){
        AdapterIphoneCharger.charge();
    }
}
