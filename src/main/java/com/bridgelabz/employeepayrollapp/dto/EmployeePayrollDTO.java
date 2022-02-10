package com.bridgelabz.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

public @ToString class EmployeePayrollDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")

    public String name;

    @Min(value = 350, message ="Minimum wage should be more than Rs.350")
    public long salary;

    @Pattern(regexp = "male|female", message = "Select Gender from Male/Female")
    public String gender;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @NotNull (message = "StartDate should Not be Empty,Please include Start date")
    @PastOrPresent (message = "StartDate should be past or todays date/Start Date should not be Future Date")
    public LocalDate startDate;

    @NotBlank(message = "Note cannot be Empty")
    public  String note;

    @NotBlank(message = "ProfilePic cannot be Empty/Add a Profile Picture")
    public String profilePic;

    @NotNull(message = "Department should not be Empty/Add Department")
    public List<String> departments;



    public EmployeePayrollDTO(String Nikhil, int i) {
    }
}

