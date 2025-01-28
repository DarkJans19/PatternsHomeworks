package com.example;

public class Tree {
    private int x;
    private int y;
    private TreeType TreeType;

    public Tree(int x, int y, TreeType TreeType){
        this.x = x;
        this.y = y;
        this.TreeType = TreeType;
    }

    public void draw(){
        TreeType.draw(x, y);
    }
}
