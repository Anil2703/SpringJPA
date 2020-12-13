package com.rocky.dao;

import com.rocky.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String> {


}
