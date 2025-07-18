package com.eil.eil_project.service;

import com.eil.eil_project.entity.LeaveRequest;
import com.eil.eil_project.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class LeaveService {

        @Autowired
        private LeaveRepository leaveRepository;

        public LeaveRequest createLeaveRequest(LeaveRequest leaveRequest) {
            return leaveRepository.save(leaveRequest);
        }

        public List<LeaveRequest> getAllLeaveRequests() {
            return leaveRepository.findAll();
        }

        public Optional<LeaveRequest> getLeaveRequestById(Long id) {
            return leaveRepository.findById(id);
        }

        public void deleteLeaveRequest(Long id) {
            leaveRepository.deleteById(id);
        }
    }


