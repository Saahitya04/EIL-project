package com.eil.eil_project.controller;

import com.eil.eil_project.entity.Department;
import com.eil.eil_project.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/api/departments")
    public class DepartmentController {

        @Autowired
        private DepartmentService departmentService;

        @PostMapping("/create")
        public Department createDepartment(@RequestBody Department department) {
            return departmentService.createDepartment(department);
        }

        @GetMapping("/all")
        public List<Department> getAllDepartments() {
            return departmentService.getAllDepartments();
        }

        @GetMapping("/{id}")
        public Optional<Department> getDepartmentById(@PathVariable Long id) {
            return departmentService.getDepartmentById(id);
        }

        @DeleteMapping("/{id}")
        public void deleteDepartment(@PathVariable Long id) {
            departmentService.deleteDepartment(id);
        }
    }



