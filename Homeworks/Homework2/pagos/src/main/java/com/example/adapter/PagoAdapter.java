package com.example.adapter;

import com.example.logic.Pago;

public class PagoAdapter implements Pago {
    private ServicioPagoExterno servicioExterno;
    private String moneda;

    public PagoAdapter(ServicioPagoExterno servicioExterno, String moneda){
        this.servicioExterno = servicioExterno;
        this.moneda = moneda;
    }

    @Override
    public void procesarPago(double monto){
        servicioExterno.pagar(moneda, monto);
    }
}
