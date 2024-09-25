package com.example;

import java.util.List;

public interface Employee {
    String getName();
    
    void add(Employee employee);

    void remove(Employee employee);

    List<Employee> getEmployees();

    int calculatePoints();
} 
