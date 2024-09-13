package com.example;

import java.util.List;
import java.util.Random;
public class Developer implements Employee{
    String name;
    public Developer(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void add(Employee employee){
        // Nothing can be implemented
    }

    @Override
    public void remove(Employee employee){
        // Nothing can be implemented
    }

    @Override
    public List<Employee> getEmployees(){
        // Nothing can be implemented
        return null;
    }

    @Override
    public int calculatePoints(){
        return new Random().nextInt(24);
    }

    @Override
    public String toString(){
        return "I am " + getName() + ", Developer";
    }
}
