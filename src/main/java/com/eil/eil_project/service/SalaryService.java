package com.eil.eil_project.service;

import com.eil.eil_project.entity.Salary;
import com.eil.eil_project.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class SalaryService {

        @Autowired
        private SalaryRepository salaryRepository;

        public Salary createSalary(Salary salary) {
            return salaryRepository.save(salary);
        }

        public List<Salary> getAllSalaries() {
            return salaryRepository.findAll();
        }

        public Optional<Salary> getSalaryById(Long id) {
            return salaryRepository.findById(id);
        }

        public void deleteSalary(Long id) {
            salaryRepository.deleteById(id);
        }
    }

