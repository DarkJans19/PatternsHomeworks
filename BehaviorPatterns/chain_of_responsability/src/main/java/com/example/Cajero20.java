package com.example;

public class Cajero20 extends Cajero{
    @Override
    public void dispensar(int cantidad){
        int resto = 0;
        if(cantidad >= 20){
            int numBilletes = cantidad / 20;
            resto = cantidad % 20;
            System.out.println("Dispensando: " + numBilletes + " billetes de 20.");
            if(resto != 0){
                siguiente.dispensar(resto);
            }
        }
        else{   
            siguiente.dispensar(cantidad);
        }
    }
}
