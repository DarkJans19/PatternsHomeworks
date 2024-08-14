/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.solid;

/**
 *
 * @author Estudiantes
 */


public class Solid {
    public static void imprimirCoches(Coche[] arrayCoches){
        for (Coche carro : arrayCoches){
            System.out.println(carro.precioMedioCoche());
        }
    }
    public static void main(String[] args) {
        Coche[] coches = {new Renault(), new Audi(), new Mercedes()};
        imprimirCoches(coches);
    }
}

abstract class Coche{
    abstract int precioMedioCoche();
}

class Renault extends Coche{
    @Override
    int precioMedioCoche(){
        return 1000;
    }
}
class Audi extends Coche{
    @Override
    int precioMedioCoche(){
        return 2000;
    }
}
class Mercedes extends Coche{
    @Override
    int precioMedioCoche(){
        return 3000;
    }
}
/*
public class Solid {

    // Al momento de crear mas coches hay que seguir modificando la clase para agregar mas condicionales
    public static void imprimirCoches(Coche[] arrayCoches){
        for (Coche carro : arrayCoches){
            if(carro.marca.equals("Renault")){
                System.out.println(1000);
            }
            if(carro.marca.equals("Audi")){
                System.out.println(2000);
            }
        }
    }
    
    // Al momento de crear mas coches hay que seguir modificando la clase principal
    public static void main(String[] args) {
        Coche[] coches = {new Coche("Renault"), new Coche("Audi")};
        imprimirCoches(coches);
    }
}

class Coche{
    String marca;
    public Coche(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
}
*/
    
