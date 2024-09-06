/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototypeej;

/**
 *
 * @author Estudiantes
 */

public class Cat extends Animal{
    public boolean flexibility;
    public Cat(){
    }
    public Cat(Cat cat){
        super(cat);
        if(cat != null){
            this.flexibility = cat.flexibility;
        }
    }
    
    @Override
    public Animal clone(){
        return new Cat (this);
    }
    
    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Cat) || !super.equals(object2)) return false;
        Cat animal2 = (Cat) object2;
        return animal2.flexibility == flexibility;
    }
}
