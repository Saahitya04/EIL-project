package com.eil.eil_project.controller;

import com.eil.eil_project.entity.WorkAssignment;
import com.eil.eil_project.service.WorkAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/api/workassignments")
    public class WorkAssignmentController {

        @Autowired
        private WorkAssignmentService workAssignmentService;

        @PostMapping("/create")
        public WorkAssignment createWorkAssignment(@RequestBody WorkAssignment workAssignment) {
            return workAssignmentService.createWorkAssignment(workAssignment);
        }

        @GetMapping("/all")
        public List<WorkAssignment> getAllWorkAssignments() {
            return workAssignmentService.getAllWorkAssignments();
        }

        @GetMapping("/{id}")
        public Optional<WorkAssignment> getWorkAssignmentById(@PathVariable Long id) {
            return workAssignmentService.getWorkAssignmentById(id);
        }

        @DeleteMapping("/{id}")
        public void deleteWorkAssignment(@PathVariable Long id) {
            workAssignmentService.deleteWorkAssignment(id);
        }
    }


