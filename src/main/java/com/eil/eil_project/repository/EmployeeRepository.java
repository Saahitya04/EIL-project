package com.eil.eil_project.repository;

import com.eil.eil_project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface EmployeeRepository extends JpaRepository<Employee, Long> {
        boolean existsByEmail(String email);
    }

