package com.example.decorator;

public class LuxuryWatchDecorator extends WatchDecorator{
    public LuxuryWatchDecorator(Watch watch){
        super(watch);
    }

    public void addFastCharge(){
        System.out.println("Fast charge");
    }
    
    public void addImpearmibility(){
        System.out.println("Impearmibility");
    }

    public void addNFC(){
        System.out.println("NFC");
    }
    
    @Override
    public void createFuncionality(){
        super.createFuncionality();
        System.out.println("And more features (Luxury Watch): ");
        this.addFastCharge();
        this.addImpearmibility();
        this.addNFC();
    }
}
