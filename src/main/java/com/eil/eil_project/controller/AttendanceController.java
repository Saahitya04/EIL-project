package com.eil.eil_project.controller;

import com.eil.eil_project.entity.Attendance;
import com.eil.eil_project.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/api/attendance")
    public class AttendanceController {

        @Autowired
        private AttendanceService attendanceService;

        @PostMapping("/create")
        public Attendance createAttendance(@RequestBody Attendance attendance) {
            return attendanceService.createAttendance(attendance);
        }

        @GetMapping("/all")
        public List<Attendance> getAllAttendance() {
            return attendanceService.getAllAttendanceRecords();
        }

        @GetMapping("/{id}")
        public Optional<Attendance> getAttendanceById(@PathVariable Long id) {
            return attendanceService.getAttendanceById(id);
        }

        @DeleteMapping("/{id}")
        public void deleteAttendance(@PathVariable Long id) {
            attendanceService.deleteAttendance(id);
        }
    }


