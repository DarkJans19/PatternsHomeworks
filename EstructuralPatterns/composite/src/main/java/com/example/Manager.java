package com.example;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private List<Employee> employees = new ArrayList<>();
    private String name;

    public Manager(String name){
        this.name = name;
    }

    @Override
    public List<Employee> getEmployees(){
        return this.employees;
    }

    @Override
    public void add(Employee employee){
        if(employee != null){
            this.employees.add(employee);
        }
    }

    @Override
    public void remove(Employee employee){
        if(employee != null){
            this.employees.remove(employee);
        }
    }

    @Override
    public int calculatePoints() {
        if (this.employees.isEmpty()) {
            return 0;
        }
        
        // Print details of each employee
        this.employees.forEach(employee -> {
            if (employee instanceof Developer) {
                System.out.println(employee);
            }
        });
        
        // Sum up the points
        return (int) this.employees.stream().mapToInt(Employee::calculatePoints).sum();
    }

    @Override
    public String getName(){
        return this.name;
    }
}
