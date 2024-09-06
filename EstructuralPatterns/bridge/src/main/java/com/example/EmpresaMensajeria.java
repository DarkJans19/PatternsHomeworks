package com.example;

public abstract class EmpresaMensajeria {

    protected IEnvio envio;

    protected EmpresaMensajeria(IEnvio envio){
        this.envio = envio;
    }

    public void recogerPaquete(){
        System.out.println("Se ha recodigo el paquete.");
        envio.procesarEnvio();
    }

    public void enviarPaquete(){
        envio.enviar();
    }

    public void entregarPaquete(){
        envio.procesarEntrega();
    }

    public void setEnvio(IEnvio envio){
        this.envio = envio;
    }
    
    public IEnvio getEnvio(){
        return envio;
    }
}