package com.employeeapp.repository;

import com.employeeapp.model.BiAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IBiAddressRepository extends JpaRepository<BiAddress,Integer> {

    @Query("from BiAddress a inner join a.employee e where e.employeeId =?1")
    BiAddress findByEmployeeId(int employeeId);
    @Query("from BiAddress a inner join a.employee e where e.name like ?1")
    List<BiAddress> findByName(String employeeName);
    @Query("from BiAddress a inner join a.employee e where e.department like ?1")
    List<BiAddress> findByDepartment(String dept);
    @Query("from BiAddress a inner join a.employee e where e.name like ?1 and a.city = ?2")
    List<BiAddress> findByNameAndCity(String name,String city);
    @Query("from BiAddress a inner join a.employee e where e.name like ?1 and a.streetName = ?2 ")
    List<BiAddress> findByNameAndStreetName(String name,String streetName);
    @Query("from BiAddress a inner join a.employee e where a.city like ?1")
    List<BiAddress> findByCity(String city);

}
