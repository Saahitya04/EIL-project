package com.eil.eil_project.controller;
import com.eil.eil_project.dto.AuthRequest;
import com.eil.eil_project.dto.AuthResponse;
import com.eil.eil_project.dto.RegisterRequest;
import com.eil.eil_project.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("/api/auth")
    public class AuthController {

        @Autowired
        private AuthService authService;

        @PostMapping("/register")
        public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
            String token = authService.register(request);
            return ResponseEntity.ok(new AuthResponse(token));
        }

        @PostMapping("/login")
        public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
            String token = authService.login(request);
            return ResponseEntity.ok(new AuthResponse(token));
        }
    }


