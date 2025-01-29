package com.example.logic;

public class PagoCripto implements Pago {
    public void procesarPago(double monto){
        System.out.println("Pago de $ " + monto + " realizado con criptomoneda.");
    }
}
