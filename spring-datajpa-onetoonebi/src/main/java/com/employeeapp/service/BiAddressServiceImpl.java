package com.employeeapp.service;

import com.employeeapp.model.BiAddress;
import com.employeeapp.repository.IBiAddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BiAddressServiceImpl implements IBiAddressService{
    IBiAddressRepository addressRepository;

    public BiAddressServiceImpl(IBiAddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public BiAddress getByEmployeeId(int employeeId) {
        return addressRepository.findByEmployeeId(employeeId);
    }

    @Override
    public List<BiAddress> getByName(String employeeName) {
        return addressRepository.findByName("%"+employeeName+"%");
    }

    @Override
    public List<BiAddress> getByDepartment(String dept) {
        return addressRepository.findByDepartment("%"+dept+"%");
    }

    @Override
    public List<BiAddress> getByNameAndCity(String name, String city) {
        return addressRepository.findByNameAndCity("%"+name+"%", city);
    }

    @Override
    public List<BiAddress> getByNameAndStreetName(String name, String streetName) {
        return addressRepository.findByNameAndStreetName("%"+name+"%", streetName);
    }

    @Override
    public List<BiAddress> getByCity(String city) {
        return addressRepository.findByCity("%"+city+"%");
    }
}
