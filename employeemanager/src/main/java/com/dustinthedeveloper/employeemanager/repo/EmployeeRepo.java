package com.dustinthedeveloper.employeemanager.repo;

import java.util.UUID;

import com.dustinthedeveloper.employeemanager.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{
    
    public static void addEmployee(Employee employee) {
            employee.setEmployeeCode(UUID.randomUUID().toString());
            
    }
}