package com.example.StudentCourseWithJpa.Controller;

import com.example.StudentCourseWithJpa.Model.Student;
import com.example.StudentCourseWithJpa.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("sc1")
@RequestMapping("/student")
public class StudentController {
    
    private final StudentService studentService;
    
    @Autowired
    StudentController( @Qualifier("ss1")  StudentService studentService){
        this.studentService=studentService;
    }
    
    @GetMapping("/record")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/record/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") int id){
        Student s1 =  studentService.getStudentById(id);
        if(s1 == null){
           return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID IS NOT EXISTS");
        }
        return ResponseEntity.ok(s1);
    }
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Successfully Added......";
    }

    @PutMapping("/update")
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "Successfully updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        studentService.deleteStudent(id);
        return "Successfully Deleted";
    }


}
