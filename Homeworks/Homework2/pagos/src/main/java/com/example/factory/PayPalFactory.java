package com.example.factory;

import com.example.logic.Pago;
import com.example.logic.PagoPayPal;

public class PayPalFactory extends PagoFactory{
    public Pago crearPago(){
        return new PagoPayPal();
    }
}
