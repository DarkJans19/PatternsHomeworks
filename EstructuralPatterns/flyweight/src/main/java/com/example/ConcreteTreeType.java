package com.example;

public class ConcreteTreeType implements TreeType {
    private String name;
    private String color;
    private String texture;

    public ConcreteTreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Dibujando un árbol de tipo: " + name +
                " (Color: " + color + ", Textura: " + texture +
                ") en la posición (" + x + ", " + y + ")");
    }
}