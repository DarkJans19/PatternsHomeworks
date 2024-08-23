package com.example;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document("hola negro");
        Iprinter regulaIprinter = new RegularPrinter();
        regulaIprinter.print(doc);
        MultiFunctionPrinter multiPrinter = new MultiFunctionPrinter();
        multiPrinter.print(doc);
        multiPrinter.scan(doc);
        multiPrinter.fax(doc);
    }
}