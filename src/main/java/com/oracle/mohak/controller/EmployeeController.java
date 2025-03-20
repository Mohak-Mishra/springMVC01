package com.oracle.mohak.controller;

import com.oracle.mohak.bean.Employee;
import com.oracle.mohak.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @GetMapping(value = "/show")
    public String showForm() {
        return "Employee";
    }
    @PostMapping(value="/save")
    public String saveForm(@ModelAttribute Employee employee, Model model) {
        System.out.println(employee);
        model.addAttribute("employee", employee);
        employeeDao.save(employee);
        return "EmpPage";
    }
}
