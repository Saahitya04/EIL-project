package com.eil.eil_project.repository;

import com.eil.eil_project.entity.Salary;
import com.eil.eil_project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

    public interface SalaryRepository extends JpaRepository<Salary, Long> {
        List<Salary> findByEmployee(Employee employee);
        List<Salary> findByMonth(String month);
    }

