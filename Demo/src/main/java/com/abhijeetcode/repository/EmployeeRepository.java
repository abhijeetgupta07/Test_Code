package com.abhijeetcode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abhijeetcode.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
 
	@Query(value="select * from (select first_name, salary from employees order by salary desc) where rownum <= 10)", nativeQuery = true)
    List<Employee> findTenMaxSalaryEmployee();
}
