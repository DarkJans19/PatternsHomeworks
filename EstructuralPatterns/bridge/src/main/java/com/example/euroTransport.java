package com.example;

public class EuroTransport extends EmpresaMensajeria{
    private String nif;

    public EuroTransport(String nif){
        IEnvio envioPorDefecto = new envioAire();

        super(envioPorDefecto);
        
        this.nif = nif;
    }

    public euroTransport(String nif, IEnvio envio){
        super(envio);
        this.nif = nif;
    }

    public void identificarse(){
        System.out.println("Identificacion: " + this.nif);
    }
}
