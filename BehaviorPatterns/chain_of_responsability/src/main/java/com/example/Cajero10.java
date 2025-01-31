package com.example;

public class Cajero10 extends Cajero{
    @Override
    public void dispensar(int cantidad){
        int resto = 0;
        if(cantidad >= 10){
            int numBilletes = cantidad / 10;
            resto = cantidad % 10;
            System.out.println("Dispensando: " + numBilletes + " billetes de 10.");
            if(resto != 0){
                System.out.println("No se puede dispensar el resto de " + resto + ".");
            }
        }
        else{   
            System.out.println("No se puede dispensar la cantidad solicitada.");
        }
    }
}
