package com.employeeapp.service;

import com.employeeapp.model.BiAddress;

import java.util.List;

public interface IBiAddressService {

    BiAddress getByEmployeeId(int employeeId);
    List<BiAddress> getByName(String employeeName);
    List<BiAddress> getByDepartment(String dept);
    List<BiAddress> getByNameAndCity(String name,String city);
    List<BiAddress> getByNameAndStreetName(String name,String streetName);
    List<BiAddress> getByCity(String city);

}
