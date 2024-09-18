package com.example.decorator;

public class WatchDecorator implements Watch{

    private final Watch watch;

    public WatchDecorator(Watch watch){
        this.watch = watch;
    }

    @Override
    public void createFuncionality(){
        this.watch.createFuncionality();
    }
}
