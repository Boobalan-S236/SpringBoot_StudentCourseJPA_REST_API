package com.example.StudentCourseWithJpa.Service;

import com.example.StudentCourseWithJpa.Model.Student;
import com.example.StudentCourseWithJpa.Repository.StudentRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service("ss1")
public class StudentService {

    private final StudentRepsitory studentRepsitory;

    @Autowired
    public StudentService( StudentRepsitory studentRepsitory){
        this.studentRepsitory=studentRepsitory;
    }

    public List<Student> getAllStudent()
    {
           return studentRepsitory.findAll();
    }


    public void addStudent(Student student) {
        studentRepsitory.save(student);
    }

    public Student getStudentById(int studentId) {
        return studentRepsitory.findById(studentId).orElse(null);
    }

    public void updateStudent(Student student) {
        studentRepsitory.save(student);
    }

    public void deleteStudent(int id) {
        studentRepsitory.deleteById(id);
    }
}
