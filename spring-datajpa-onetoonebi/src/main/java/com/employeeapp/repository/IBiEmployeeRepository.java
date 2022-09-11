package com.employeeapp.repository;

import com.employeeapp.model.BiAddress;
import com.employeeapp.model.BiEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.EmptyStackException;
import java.util.List;

@Repository
public interface IBiEmployeeRepository extends JpaRepository<BiEmployee,Integer> {

    List<BiEmployee> findByDepartment(String department);
    List<BiEmployee> findByAddressCity(String city);

    @Query("from BiEmployee e inner join e.address a where e.department =?1 and a.city = ?2")
    List<BiEmployee> findByDeptAndCity(String department, String city);
    @Query("from BiEmployee e inner join e.address a where a.state = ?1")
    List<BiEmployee> findByState(String state);
    @Query("from BiEmployee e inner join e.address a where a.flatNumber = ?1")
    BiEmployee findByFlatNumber(String flatNumber);
}
