package com.example.StudentCourseWithJpa.Repository;

import com.example.StudentCourseWithJpa.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepsitory extends JpaRepository<Student,Integer> {

}
