package com.School.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @GetMapping("/")
    public ResponseEntity<String> getSubjectHomepage() {
        System.out.println("Subject Homepage Accessed");
        return new ResponseEntity<>("Welcome to the Subject Homepage", HttpStatus.OK);
    }






}
