package com.example.decorator;

public class SportWatchDecorator extends WatchDecorator{
    public SportWatchDecorator(Watch watch){
        super(watch);
    }

    public void addPedometer(){
        System.out.println("Pedometer");
    }

    public void addSleepMode(){
        System.out.println("Sleep mode");
    }

    @Override 
    public void createFuncionality(){
        super.createFuncionality();
        System.out.println("And more features (Sport Watch): ");
        this.addPedometer();
        this.addSleepMode();
    }
}
