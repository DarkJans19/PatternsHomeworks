package com.example;

public class MultiFunctionPrinter implements Iprinter, IScannable, IFaxable{
    @Override
    public void print(Document document) {
        System.out.println("Printing document: " + document.getContent());
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning document: " + document.getContent());
    }

    @Override
    public void fax(Document document) {
        System.out.println("Faxing document: " + document.getContent());
    }

}
