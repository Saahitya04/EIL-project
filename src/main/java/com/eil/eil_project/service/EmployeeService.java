package com.eil.eil_project.service;

import com.eil.eil_project.entity.Employee;
import com.eil.eil_project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class EmployeeService {

        @Autowired
        private EmployeeRepository employeeRepository;

        public Employee createEmployee(Employee employee) {
            return employeeRepository.save(employee);
        }

        public List<Employee> getAllEmployees() {
            return employeeRepository.findAll();
        }

        public Optional<Employee> getEmployeeById(Long id) {
            return employeeRepository.findById(id);
        }

        public void deleteEmployee(Long id) {
            employeeRepository.deleteById(id);
        }
    }
