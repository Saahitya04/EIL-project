package com.eil.eil_project.controller;

import com.eil.eil_project.entity.LeaveRequest;
import com.eil.eil_project.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/api/leaves")
    public class LeaveController {

        @Autowired
        private LeaveService leaveService;

        @PostMapping("/create")
        public LeaveRequest createLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
            return leaveService.createLeaveRequest(leaveRequest);
        }

        @GetMapping("/all")
        public List<LeaveRequest> getAllLeaveRequests() {
            return leaveService.getAllLeaveRequests();
        }

        @GetMapping("/{id}")
        public Optional<LeaveRequest> getLeaveRequestById(@PathVariable Long id) {
            return leaveService.getLeaveRequestById(id);
        }

        @DeleteMapping("/{id}")
        public void deleteLeaveRequest(@PathVariable Long id) {
            leaveService.deleteLeaveRequest(id);
        }
    }

