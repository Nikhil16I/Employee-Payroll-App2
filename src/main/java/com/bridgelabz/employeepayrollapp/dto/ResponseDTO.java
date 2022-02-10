package com.bridgelabz.employeepayrollapp.dto;

import com.bridgelabz.employeepayrollapp.entity.EmployeePayrollData;
import lombok.Data;

//Lombok added
public @Data/*Anotation added instead of getters and setters*/
class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}

