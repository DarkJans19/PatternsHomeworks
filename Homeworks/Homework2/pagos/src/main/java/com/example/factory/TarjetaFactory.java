package com.example.factory;

import com.example.logic.Pago;
import com.example.logic.PagoTarjeta;

public class TarjetaFactory {
    public Pago crearPago(){
        return new PagoTarjeta();
    }
}
