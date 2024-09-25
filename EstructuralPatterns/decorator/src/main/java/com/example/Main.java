package com.example;
import com.example.decorator.*;
public class Main {
    public static void main(String[] args) {
        Watch basiWatch = new BasicWatch();
        basiWatch.createFuncionality();
        System.out.println("---------\n");

        Watch sportWatch = new SportWatchDecorator(new BasicWatch());
        sportWatch.createFuncionality();
        System.out.println("---------\n");

        Watch LuxuryWatch = new LuxuryWatchDecorator(new BasicWatch());
        LuxuryWatch.createFuncionality();
        System.out.println("---------\n");
    }
}