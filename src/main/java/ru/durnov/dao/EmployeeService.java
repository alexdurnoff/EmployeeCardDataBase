package ru.durnov.dao;

import ru.durnov.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee employeeById(int id);
    List<Employee> findAll();
    void saveEmployee(Employee employee);
}
