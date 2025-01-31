package com.example;

public class Main {
    public static void main(String[] args) {
        Cajero cajero50 = new Cajero50();
        Cajero cajero20 = new Cajero20();
        Cajero cajero10 = new Cajero10();

        // Aqui configuramos la cadena de responsabilidad
        cajero50.setSiguiente(cajero20);
        cajero20.setSiguiente(cajero10);

        // Probamos la cadena con diferentes cantidades
        System.out.println("Solicitud de 180:");
        cajero50.dispensar(180);

        System.out.println("\nSolicitud de 70:");
        cajero50.dispensar(70);

        System.out.println("\nSolicitud de 25:");
        cajero50.dispensar(25);

        /*
        Aquí si se desea se puede agregar valor por teclado utilizando 
        la clase Scanner de la siguiente manera:
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a retirar: ");
        int cantidad = entrada.nextInt();
        Y se puede llamar al método dispensar de la siguiente manera:
        cajero50.dispensar(cantidad);
        y con esto funcionaria de la misma manera
        

        Ademas se podría colocar un cajero que tenga mas billetes
        de 100, 200, 500, etc. y se podría agregar a la cadena de
        responsabilidad de la siguiente manera:
        Cajero cajero100 = new Cajero100();
        cajero100.setSiguiente(cajero50);
        Y asi con los demás cajeros que se deseen agregar
        */
    }
}