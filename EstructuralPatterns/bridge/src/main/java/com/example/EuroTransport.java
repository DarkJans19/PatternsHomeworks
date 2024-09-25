package com.example;

public class EuroTransport extends EmpresaMensajeria{
    private String nif;

    public EuroTransport(String nif){
        super(new EnvioAire());
        this.nif = nif;
    }

    public EuroTransport(String nif, IEnvio envio){
        super(envio);
        this.nif = nif;
    }

    public void identificarse(){
        System.out.println("Identificacion: " + this.nif);
    }
}