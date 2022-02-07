package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
    /*UC-1*/
    @RequestMapping(value = {"","/","/get","home"})
public ResponseEntity<String>getEmployeePayrollData(){
return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
 }
}