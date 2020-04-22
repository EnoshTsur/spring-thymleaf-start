package com.example.students.controllers;

import com.example.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentsController {

    private StudentRepository repository;

    @Autowired
    public StudentsController(StudentRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/all")
    public String allStudents(Model model) {
        model.addAttribute("students", repository.findAll());
        return "students/list";
    }
}
