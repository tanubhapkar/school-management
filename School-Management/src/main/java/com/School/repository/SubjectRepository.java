package com.School.repository;

import com.School.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, UUID> {

    Subject findByName(String name);

    Subject findBySubjectId(UUID subjectId);
}
