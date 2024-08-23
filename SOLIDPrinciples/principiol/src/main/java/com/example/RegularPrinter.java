package com.example;

public class RegularPrinter implements Iprinter{

    @Override
    public void print(com.example.Document document) {
        System.out.println("Printing document: " + document.getContent());
    }
}
