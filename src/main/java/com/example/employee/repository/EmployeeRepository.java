// Write your code here

package com.example.employee.repository;

import java.util.*;
import com.example.employee.model.Employee;

public interface EmployeeRepository {
    ArrayList<Employee> getAllEmployees();

    Employee getEmployeeById(int employeeId);

    Employee addEmployee(Employee employee);

    Employee updateEmployeeDetails(int employeeId, Employee employee);

    void removeEmployee(int employeeId);
}