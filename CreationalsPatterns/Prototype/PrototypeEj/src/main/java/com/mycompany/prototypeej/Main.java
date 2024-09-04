/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prototypeej;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Estudiantes
 */
public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Cat cat = new Cat();
        cat.legs = 4;
        cat.mammal = true;
        cat.omnivorous = true;
        cat.color = "Black";
        cat.flexibility = true;
        animals.add(cat);
        
        Cat anotherCat = (Cat)cat.clone();
        animals.add(anotherCat);
        
        Parrot parrot = new Parrot();
        parrot.phrase = "Hello there!";
        parrot.color = "Green";
        parrot.legs = 2;
        parrot.omnivorous = true;
        parrot.mammal = false;
        animals.add(parrot);
        
        Parrot anotherParrot = (Parrot) parrot.clone();
        animals.add(anotherParrot);
        
        System.out.println("Cats equals " + animals.get(0).equals(animals.get(1)));
        System.out.println("Parrots equals " +animals.get(2).equals(animals.get(3)));
    }
}
