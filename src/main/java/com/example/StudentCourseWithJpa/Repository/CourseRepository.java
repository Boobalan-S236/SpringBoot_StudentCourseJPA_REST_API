package com.example.StudentCourseWithJpa.Repository;

import com.example.StudentCourseWithJpa.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CourseRepository extends JpaRepository<Course,Integer> {

}
