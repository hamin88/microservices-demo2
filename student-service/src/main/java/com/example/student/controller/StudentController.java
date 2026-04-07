package com.example.student.controller;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @GetMapping
    public List<String> getAllStudents() {
        return Arrays.asList("Alice Johnson", "Bob Smith", "Charlie Brown");
    }
}
