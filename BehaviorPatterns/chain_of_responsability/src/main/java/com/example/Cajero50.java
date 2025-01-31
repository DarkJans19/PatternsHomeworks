package com.example;

public class Cajero50 extends Cajero{
    @Override
    public void dispensar(int cantidad){
        int resto = 0;
        if(cantidad >= 50){
            int numBilletes = cantidad / 50;
            resto = cantidad % 50;
            System.out.println("Dispensando: " + numBilletes + " billetes de 50.");
            if(resto != 0){
                siguiente.dispensar(resto);
            }
        }
        else{   
            siguiente.dispensar(cantidad);
        }
    }
}