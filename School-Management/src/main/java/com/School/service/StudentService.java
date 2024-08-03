package com.School.service;

import com.School.entity.Student;
import com.School.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public StudentService(StudentRepository sr) {
        this.sr = sr;
    }

    @Autowired
    private StudentRepository sr;


    public Student addStudentToDB(Student student) {

        return this.sr.save(student);   }

    public List<Student> getAllStudents(){
        return this.sr.findAll();
    }


}
