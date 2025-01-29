package com.example.adapter;

public class ServicioPagoExterno {
    void pagar(String moneda, double cantidad){
        System.out.println("Pago de: " + cantidad + " realizado en: " + moneda + " a traves del servicio externo.");
    }
}
