package com.example.StudentCourseWithJpa.Service;

import com.example.StudentCourseWithJpa.Model.Course;
import com.example.StudentCourseWithJpa.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("cs1")
public class CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService( CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    public Optional<Course> getSpecificCourse(int id) {
        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }
    public String greet(){
        return "Welcome to course website.........";
    }
}
