package com.bridgelabz.employeepayrollapp.repository;


import com.bridgelabz.employeepayrollapp.entity.EmployeePayrollData;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData , Integer> {

        @Query(value = "select * from spring_payroll_services, employee_department where employee_id and department = :department", nativeQuery = true)
        List<EmployeePayrollData> findEmployeeByDepartment(String department);
    }

