package com.eil.eil_project.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

    @Entity
    public class WorkAssignment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String taskDescription;

        private LocalDate assignedDate;

        private LocalDate deadline;

        private boolean completed;

        @ManyToOne
        @JoinColumn(name = "employee_id")
        private Employee employee;

        public WorkAssignment() {}

        // Getters and setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getTaskDescription() { return taskDescription; }
        public void setTaskDescription(String taskDescription) { this.taskDescription = taskDescription; }

        public LocalDate getAssignedDate() { return assignedDate; }
        public void setAssignedDate(LocalDate assignedDate) { this.assignedDate = assignedDate; }

        public LocalDate getDeadline() { return deadline; }
        public void setDeadline(LocalDate deadline) { this.deadline = deadline; }

        public boolean isCompleted() { return completed; }
        public void setCompleted(boolean completed) { this.completed = completed; }

        public Employee getEmployee() { return employee; }
        public void setEmployee(Employee employee) { this.employee = employee; }
    }


