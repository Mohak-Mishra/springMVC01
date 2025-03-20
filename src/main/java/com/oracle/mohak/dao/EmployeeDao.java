package com.oracle.mohak.dao;

import com.oracle.mohak.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
