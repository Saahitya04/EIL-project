package com.eil.eil_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HomeController {

        @GetMapping("/")
        public String home() {
            return "✅ EIL Project Backend is Up and Running!";
        }
    }

