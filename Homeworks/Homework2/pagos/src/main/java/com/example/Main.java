package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.factory.*;
import com.example.adapter.*;
import com.example.logic.*;

public class Main {
    public static void main(String[] args) {
        List<Pago> pagos = new ArrayList<>();

        // Usando Factory Method
        pagos.add(new TarjetaFactory().crearPago());
        pagos.add(new PayPalFactory().crearPago());
        pagos.add(new CriptoFactory().crearPago());

        // Crear el servicio externo
        PagoExterno pagoMercadoPago = new PagoMercadoPago();

        // Usando Adapter para el servicio externo
        Pago pagoAdaptado = new PagoAdapter(pagoMercadoPago);
        pagos.add(pagoAdaptado);

        // Procesar todos los pagos
        for (Pago pago : pagos) {
            pago.procesarPago(100.0);
        }
    }
}