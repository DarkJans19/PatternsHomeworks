package com.example;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType type = treeTypes.get(name);
        if (type == null) {
            type = new ConcreteTreeType(name, color, texture);
            treeTypes.put(name, type); // Corregido: se usa 'name' como clave
        }
        return type;
    }
}