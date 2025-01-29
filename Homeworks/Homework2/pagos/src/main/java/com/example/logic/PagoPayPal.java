package com.example.logic;

public class PagoPayPal implements Pago{
    public void procesarPago(double monto){
        System.out.println("Pago de $ " + monto + " realizado con Paypal.");
    }
}
