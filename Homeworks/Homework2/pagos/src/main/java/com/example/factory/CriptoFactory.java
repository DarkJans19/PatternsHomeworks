package com.example.factory;

import com.example.logic.Pago;
import com.example.logic.PagoCripto;


public class CriptoFactory extends PagoFactory{
    public Pago crearPago(){
        return new PagoCripto();
    }
}
