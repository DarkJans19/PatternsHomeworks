/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapter;

/**
 *
 * @author Jan Sanchez
 */
public class Main {

    public static void main(String[] args) {
        IPhone6s iphone6s = new IPhone6s(new AdapterIphoneCharger());
        iphone6s.onCharge();
    }
}
