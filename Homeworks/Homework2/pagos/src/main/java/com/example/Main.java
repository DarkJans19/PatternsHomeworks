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

        // Usando Adapter para el servicio externo
        ServicioPagoExterno servicioExterno = new ServicioPagoExterno();
        pagos.add(new PagoAdapter(servicioExterno, "USD"));

        // Procesar todos los pagos
        for (Pago pago : pagos) {
            pago.procesarPago(100.0);
        }
    }
}