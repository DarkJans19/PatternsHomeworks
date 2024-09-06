package com.example;

public class FacturaIVA extends Factura{
    @Override
    public double getImporteIva(){
        return getImporte() * 1.07;
    }
}
