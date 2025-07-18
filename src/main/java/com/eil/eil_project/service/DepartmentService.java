package com.eil.eil_project.service;

import com.eil.eil_project.entity.Department;
import com.eil.eil_project.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class DepartmentService {

        @Autowired
        private DepartmentRepository departmentRepository;

        public Department createDepartment(Department department) {
            return departmentRepository.save(department);
        }

        public List<Department> getAllDepartments() {
            return departmentRepository.findAll();
        }

        public Optional<Department> getDepartmentById(Long id) {
            return departmentRepository.findById(id);
        }

        public void deleteDepartment(Long id) {
            departmentRepository.deleteById(id);
        }
    }

