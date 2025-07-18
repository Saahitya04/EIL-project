package com.eil.eil_project.entity;

import jakarta.persistence.*;
import java.util.List;

    @Entity
    public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private String email;

        private String phone;

        @ManyToOne
        @JoinColumn(name = "department_id")
        private Department department;

        @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
        private List<Attendance> attendanceRecords;

        @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
        private List<LeaveRequest> leaveRequests;

        @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
        private List<WorkAssignment> workAssignments;

        @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
        private Salary salary;

        public Employee() {}

        // Getters and setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }

        public Department getDepartment() { return department; }
        public void setDepartment(Department department) { this.department = department; }

        public List<Attendance> getAttendanceRecords() { return attendanceRecords; }
        public void setAttendanceRecords(List<Attendance> attendanceRecords) { this.attendanceRecords = attendanceRecords; }

        public List<LeaveRequest> getLeaveRequests() { return leaveRequests; }
        public void setLeaveRequests(List<LeaveRequest> leaveRequests) { this.leaveRequests = leaveRequests; }

        public List<WorkAssignment> getWorkAssignments() { return workAssignments; }
        public void setWorkAssignments(List<WorkAssignment> workAssignments) { this.workAssignments = workAssignments; }

        public Salary getSalary() { return salary; }
        public void setSalary(Salary salary) { this.salary = salary; }
    }


