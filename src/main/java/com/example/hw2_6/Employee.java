package com.example.hw2_6;

import java.util.Objects;

public class Employee {

    private String name;
    private String familyName;


    public Employee(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;

    }
    public String getName() {
        return name;
    }
    public String getFamilyName() {
        return familyName;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(familyName, employee.familyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, familyName);
    }

    @Override
 public String toString(){
        return String.format(familyName, name);
 }
}
