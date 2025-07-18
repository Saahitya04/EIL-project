package com.eil.eil_project.repository;

import com.eil.eil_project.entity.WorkAssignment;
import com.eil.eil_project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

    public interface WorkAssignmentRepository extends JpaRepository<WorkAssignment, Long> {
        List<WorkAssignment> findByEmployee(Employee employee);
        List<WorkAssignment> findByCompleted(boolean completed);
    }

