package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.entity.EmployeePayrollData;

import java.util.ArrayList;
import java.util.List;

public class EmplyeePayrollService implements IEmployeePayrollService{
    public List<EmployeePayrollData> getEmployeePayroll(){
        List<EmployeePayrollData> data=new ArrayList<>();
        data.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Nikhil",45000)));
        return data;
    }
}
