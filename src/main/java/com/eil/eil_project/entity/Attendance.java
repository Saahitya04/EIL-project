package com.eil.eil_project.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

    @Entity
    public class Attendance {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private LocalDate date;

        private String inTime;

        private String outTime;

        private boolean present;

        @ManyToOne
        @JoinColumn(name = "employee_id")
        private Employee employee;

        public Attendance() {}

        // Getters and setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public LocalDate getDate() { return date; }
        public void setDate(LocalDate date) { this.date = date; }

        public String getInTime() { return inTime; }
        public void setInTime(String inTime) { this.inTime = inTime; }

        public String getOutTime() { return outTime; }
        public void setOutTime(String outTime) { this.outTime = outTime; }

        public boolean isPresent() { return present; }
        public void setPresent(boolean present) { this.present = present; }

        public Employee getEmployee() { return employee; }
        public void setEmployee(Employee employee) { this.employee = employee; }
    }


