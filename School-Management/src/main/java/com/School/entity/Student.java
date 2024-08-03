package com.School.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID studentId;

    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;

    @ManyToMany(mappedBy = "enrolledStudents",cascade = {CascadeType.ALL, CascadeType.PERSIST,CascadeType.MERGE})
    private List<Subject> enrolledSubjects;

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Subject> getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(List<Subject> enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }

    public Student() {
    }

    public Student(String name, String email, String password, String address, String phone,
            List<Subject> enrolledSubjects) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.enrolledSubjects = enrolledSubjects;
    }

    public Student(String name, String email, String password, String address, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name + ", email=" + email + ", password=" + password
                + ", address=" + address + ", phone=" + phone + ", enrolledSubjects=" + enrolledSubjects + "]";
    }

}
