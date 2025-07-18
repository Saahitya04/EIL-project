package com.eil.eil_project.controller;

import com.eil.eil_project.entity.Salary;
import com.eil.eil_project.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/api/salaries")
    public class SalaryController {

        @Autowired
        private SalaryService salaryService;

        @PostMapping("/create")
        public Salary createSalary(@RequestBody Salary salary) {
            return salaryService.createSalary(salary);
        }

        @GetMapping("/all")
        public List<Salary> getAllSalaries() {
            return salaryService.getAllSalaries();
        }

        @GetMapping("/{id}")
        public Optional<Salary> getSalaryById(@PathVariable Long id) {
            return salaryService.getSalaryById(id);
        }

        @DeleteMapping("/{id}")
        public void deleteSalary(@PathVariable Long id) {
            salaryService.deleteSalary(id);
        }
    }


