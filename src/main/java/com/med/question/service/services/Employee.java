package com.med.question.service.services;

public class Employee {

    String name;
    Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;


    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }
}
