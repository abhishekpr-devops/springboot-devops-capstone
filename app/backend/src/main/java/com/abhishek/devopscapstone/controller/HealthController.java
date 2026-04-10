package com.abhishek.devopscapstone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
                "message", "Spring Boot DevOps Capstone API is running",
                "timestamp", Instant.now().toString(),
                "status", "ok"
        );
    }

    @GetMapping("/api/health")
    public Map<String, Object> health() {
        return Map.of(
                "service", "devops-capstone-backend",
                "status", "UP",
                "timestamp", Instant.now().toString()
        );
    }
}
