package com.School.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.School.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {

    List<Student> findAllByName(String name);

    Student findByStudentId(UUID studentIid);

    List<Student> findAll();

}
