package com.eil.eil_project.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

    @Entity
    public class Salary {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private BigDecimal amount;

        private String month; // e.g., "July 2025"

        private boolean paid;

        @OneToOne
        @JoinColumn(name = "employee_id")
        private Employee employee;

        public Salary() {}

        // Getters and setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public BigDecimal getAmount() { return amount; }
        public void setAmount(BigDecimal amount) { this.amount = amount; }

        public String getMonth() { return month; }
        public void setMonth(String month) { this.month = month; }

        public boolean isPaid() { return paid; }
        public void setPaid(boolean paid) { this.paid = paid; }

        public Employee getEmployee() { return employee; }
        public void setEmployee(Employee employee) { this.employee = employee; }
    }


