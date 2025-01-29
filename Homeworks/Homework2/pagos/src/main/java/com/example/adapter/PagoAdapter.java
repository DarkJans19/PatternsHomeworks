package com.example.adapter;

import com.example.logic.Pago;

public class PagoAdapter implements Pago {
    private PagoExterno servicioPago;

    public PagoAdapter(PagoExterno servicioExterno){
        this.servicioPago = servicioExterno;
    }

    @Override
    public void procesarPago(double monto){
        servicioPago.Pagar(monto);
    }
}
