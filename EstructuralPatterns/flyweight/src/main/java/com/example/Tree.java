package com.example;

public class Tree {
    private int x;
    private int y;
    private TreeType treeType; // Cambiado a minúscula para seguir convenciones

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(x, y);
    }
}