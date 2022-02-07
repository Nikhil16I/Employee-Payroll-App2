package com.bridgelabz.employeepayrollapp.dto;

public class EmploeePayrollDTO {
    public String name;
    public long salary;

    public EmploeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmploeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
