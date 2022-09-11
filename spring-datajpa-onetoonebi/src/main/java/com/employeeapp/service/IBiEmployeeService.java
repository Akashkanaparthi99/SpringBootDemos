package com.employeeapp.service;

import com.employeeapp.model.BiEmployee;

import java.util.List;

public interface IBiEmployeeService {
    BiEmployee addEmployee(BiEmployee employee);
    void updateEmployee(BiEmployee employee);
    void deleteEmployee(int studentId);

    BiEmployee getById(int studentId);
    List<BiEmployee> getAll();

    List<BiEmployee> getByDepartment(String department);
    List<BiEmployee> getByCity(String city);
    List<BiEmployee> getByDeptAndCity(String dept, String city);
    List<BiEmployee> getByState(String state);
    BiEmployee getByFlatNumber(String flatNumber);
}
