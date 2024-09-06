package com.example;

public class FactoriaFacturas {
    public static Factura getFactura(String tipo) {
        if (tipo.equals("iva")) {
            return new FacturaIVA();
        } 
        else {
            return new FacturaIVAReducido();
        }
    }
}
