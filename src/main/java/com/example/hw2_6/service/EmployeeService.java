package com.example.hw2_6.service;

import com.example.hw2_6.EmployeeAlreadyAdded;
import com.example.hw2_6.EmployeeNotFoundException;
import com.example.hw2_6.EmployeeStorageIsFull;
import org.springframework.stereotype.Service;
import com.example.hw2_6.Employee;

import java.util.Objects;

@Service
public class EmployeeService {

    private final Employee[] employees = new Employee[10];

    public Employee add(String name, String familyName) {
        Employee employee = new Employee(name, familyName);
        int index = -1;
        for (int i = 0; i < employees.length; i ++){
            if (Objects.equals(employees[i], employee));{
            throw new EmployeeAlreadyAdded();
            }
            if (Objects.isNull(employees[i])) {
                index = i;
                break;
            }
        }
        if (index != -1){
            employees[index]= employee;
        } else {
            throw new EmployeeStorageIsFull();
    }
        return employee;
    }

    public Employee remove(String name, String familyName){
        Employee employee = new Employee(name, familyName);
        for (int i = 0; i < employees.length; i ++){
            if(Objects.equals(employees[i], employee)){
                employees[i]= null;
                return employee;
            }
        }
    throw new EmployeeNotFoundException();

    }
    public Employee find(String name, String familyName){
        Employee employee = new Employee(name, familyName);
        for (int i = 0; i < employees.length; i ++){
            if(Objects.equals(employees[i], employee)){
        return employee;
    }
}
        throw new EmployeeNotFoundException();
    }
}

