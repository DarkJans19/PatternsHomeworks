package com.example.logic;

import com.example.adapter.*;
public class PagoMercadoPago implements PagoExterno{
    @Override
    public void Pagar(double monto){
        System.out.println("Pago procesado con mercado pago por $" + monto);
    }
}
