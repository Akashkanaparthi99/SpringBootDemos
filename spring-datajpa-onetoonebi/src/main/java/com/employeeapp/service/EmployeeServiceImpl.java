package com.employeeapp.service;

import com.employeeapp.model.BiEmployee;
import com.employeeapp.repository.IBiEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements IBiEmployeeService {

    IBiEmployeeRepository employeeRepository;
    @Autowired
    public void setEmployeeRepository(IBiEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public BiEmployee addEmployee(BiEmployee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(BiEmployee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public BiEmployee getById(int employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public List<BiEmployee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<BiEmployee> getByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }

    @Override
    public List<BiEmployee> getByCity(String city) {
        return employeeRepository.findByAddressCity(city);
    }

    @Override
    public List<BiEmployee> getByDeptAndCity(String dept, String city) {
        return employeeRepository.findByDeptAndCity(dept, city);
    }

    @Override
    public List<BiEmployee> getByState(String state) {
        return employeeRepository.findByState(state);
    }

    @Override
    public BiEmployee getByFlatNumber(String flatNumber) {
        return employeeRepository.findByFlatNumber(flatNumber);
    }
}
