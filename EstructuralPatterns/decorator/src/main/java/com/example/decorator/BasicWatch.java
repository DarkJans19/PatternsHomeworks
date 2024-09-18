package com.example.decorator;

public class BasicWatch implements Watch{
    public void addTimer(){
        System.out.println("Timer");
    }

    public void addChronometer(){
        System.out.println("Chronometer");
    }

    @Override
    public void createFuncionality(){
        System.out.println("Basic watch with: ");
        this.addTimer();
        this.addChronometer();
    }
}
