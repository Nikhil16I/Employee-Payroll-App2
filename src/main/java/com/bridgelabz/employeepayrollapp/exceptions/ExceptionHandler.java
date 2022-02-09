package com.bridgelabz.employeepayrollapp.exceptions;

import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(EmployeePayrollException.class)
    public ResponseEntity<ResponseDTO> handleEmployeePayrollException(EmployeePayrollException exception){
        ResponseDTO respDTO = new ResponseDTO("Handling sException Throws while processing REST API", exception.getMessage());
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.BAD_REQUEST);
    }
}
