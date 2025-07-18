package com.eil.eil_project.repository;

import com.eil.eil_project.entity.Attendance;
import com.eil.eil_project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

    public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
        List<Attendance> findByEmployee(Employee employee);
        List<Attendance> findByDate(LocalDate date);
    }
