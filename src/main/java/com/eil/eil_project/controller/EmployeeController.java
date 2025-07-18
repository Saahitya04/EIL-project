package com.eil.eil_project.controller;

import com.eil.eil_project.entity.Employee;
import com.eil.eil_project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/api/employees")
    public class EmployeeController {

        @Autowired
        private EmployeeService employeeService;

        @PostMapping("/create")
        public Employee createEmployee(@RequestBody Employee employee) {
            return employeeService.createEmployee(employee);
        }

        @GetMapping("/all")
        public List<Employee> getAllEmployees() {
            return employeeService.getAllEmployees();
        }

        @GetMapping("/{id}")
        public Optional<Employee> getEmployeeById(@PathVariable Long id) {
            return employeeService.getEmployeeById(id);
        }

        @DeleteMapping("/{id}")
        public void deleteEmployee(@PathVariable Long id) {
            employeeService.deleteEmployee(id);
        }
    }

