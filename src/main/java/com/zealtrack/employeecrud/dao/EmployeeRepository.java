package com.zealtrack.employeecrud.dao;

import com.zealtrack.employeecrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //no need to write any code, all the required CRUD methods are provided by JPA itself
    //like magic methods
}
