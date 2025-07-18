package com.eil.eil_project.service;

import com.eil.eil_project.entity.Attendance;
import com.eil.eil_project.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class AttendanceService {

        @Autowired
        private AttendanceRepository attendanceRepository;

        public Attendance createAttendance(Attendance attendance) {
            return attendanceRepository.save(attendance);
        }

        public List<Attendance> getAllAttendanceRecords() {
            return attendanceRepository.findAll();
        }

        public Optional<Attendance> getAttendanceById(Long id) {
            return attendanceRepository.findById(id);
        }

        public void deleteAttendance(Long id) {
            attendanceRepository.deleteById(id);
        }
    }


