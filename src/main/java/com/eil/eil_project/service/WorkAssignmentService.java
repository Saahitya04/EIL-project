package com.eil.eil_project.service;

import com.eil.eil_project.entity.WorkAssignment;
import com.eil.eil_project.repository.WorkAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class WorkAssignmentService {

        @Autowired
        private WorkAssignmentRepository workAssignmentRepository;

        public WorkAssignment createWorkAssignment(WorkAssignment workAssignment) {
            return workAssignmentRepository.save(workAssignment);
        }

        public List<WorkAssignment> getAllWorkAssignments() {
            return workAssignmentRepository.findAll();
        }

        public Optional<WorkAssignment> getWorkAssignmentById(Long id) {
            return workAssignmentRepository.findById(id);
        }

        public void deleteWorkAssignment(Long id) {
            workAssignmentRepository.deleteById(id);
        }
    }


