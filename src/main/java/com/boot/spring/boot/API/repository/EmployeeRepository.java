package com.boot.spring.boot.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.boot.spring.boot.API.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
