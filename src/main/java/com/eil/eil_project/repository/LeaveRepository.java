package com.eil.eil_project.repository;

import com.eil.eil_project.entity.LeaveRequest;
import com.eil.eil_project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

    public interface LeaveRepository extends JpaRepository<LeaveRequest, Long> {
        List<LeaveRequest> findByEmployee(Employee employee);
        List<LeaveRequest> findByStatus(String status);
    }


