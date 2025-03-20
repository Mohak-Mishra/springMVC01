package com.oracle.mohak.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emp")
public class Employee {
    @Id
    private Integer empId;
    private String empName;
    private Double empSalary;
    private String empPwd;
    private String empDept;
    private String empAddr;
}
