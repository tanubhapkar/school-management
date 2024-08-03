package com.School.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID subjectId;

    private String name;

    @ManyToMany(cascade = {CascadeType.ALL, CascadeType.PERSIST,CascadeType.MERGE})
    private List<Student> enrolledStudents;

    public UUID getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(UUID subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public Subject(String name, List<Student> enrolledStudents) {
        this.name = name;
        this.enrolledStudents = enrolledStudents;
    }

    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject [subjectId=" + subjectId + ", name=" + name + ", enrolledStudents=" + enrolledStudents + "]";
    }

}
