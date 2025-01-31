package com.example;

public class ControlRemoto {
    private Command comando;

    public void setComando(Command comando){
        this.comando = comando;
    }

    public void presionarBoton(){
        if(comando != null){
            comando.ejecutar();
        }
    }
}
