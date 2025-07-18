package com.eil.eil_project.entity;

import jakarta.persistence.*;
import java.util.List;

    @Entity
    public class Department {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private String description;

        @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
        private List<Employee> employees;

        public Department() {}

        // Getters and setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }

        public List<Employee> getEmployees() { return employees; }
        public void setEmployees(List<Employee> employees) { this.employees = employees; }
    }


