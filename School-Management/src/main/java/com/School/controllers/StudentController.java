package com.School.controllers;

import com.School.entity.Student;
import com.School.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService ss;

    @GetMapping("/")
    public ResponseEntity<String> getStudentHomepage() {
        System.out.println("Student Homepage Accessed");
        return new ResponseEntity<>("Welcome to the Student Homepage", HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        System.out.println("Student to be Added: "+ student);
        Student addedStudentToDB = ss.addStudentToDB(student);
        return new ResponseEntity<>("Student Added with ID: "+addedStudentToDB.getStudentId(), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> allStudents = this.ss.getAllStudents();
        System.out.println("All Students: "+allStudents);
        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }


}
