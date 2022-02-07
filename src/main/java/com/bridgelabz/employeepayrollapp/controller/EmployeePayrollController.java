package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmploeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
    /*UC-1*/
    @RequestMapping(value = {"","/","/get","home"})
public ResponseEntity<String>getEmployeePayrollData(){
return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
 }
 @GetMapping("/get/{empId}")
 public ResponseEntity<String>getEmployeePayrollData(@PathVariable("empId")int empId){
     return new ResponseEntity<String>("Get Call Success for Id:"+empId,HttpStatus.OK);
}
@PostMapping("/create")
public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmploeePayrollDTO emploeePayrollDTO){
return  new ResponseEntity<String>("Created Employee Payroll Data for:"+emploeePayrollDTO,HttpStatus.OK);
}
@PutMapping("/update")
public ResponseEntity<String>updateEmployeePayrollData(@RequestBody EmploeePayrollDTO emploeePayrollDTO){
return new ResponseEntity<String>("Updated Employee Payroll Data for :"+emploeePayrollDTO,HttpStatus.OK);
}
@DeleteMapping("/Delete/{empId}")
public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
return new ResponseEntity<String>("Delete Call Success for Id :"+empId,HttpStatus.OK);
 }
}