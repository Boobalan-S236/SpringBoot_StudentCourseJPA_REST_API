package com.example.StudentCourseWithJpa.Controller;

import com.example.StudentCourseWithJpa.Model.Course;
import com.example.StudentCourseWithJpa.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("cc1")
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService ;
    @Autowired
    public CourseController(@Qualifier("cs1") CourseService courseService) {
        this.courseService = courseService;
        System.out.println("CONS Called.....");
    }

    @GetMapping("/home")
    public String greet(){
        return courseService.greet();
    }
//    @Override
//    public void afterPropertiesSet(){
//        System.out.println("IAM INITIALIZE PHASE AFTER BEAN CREATION....");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("BEAN DESTROYEDDDDD.....");
//    }
    @GetMapping("/record")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    @GetMapping("/record/{id}")
    public ResponseEntity<?> getSpecificCourse(@PathVariable("id") int id){
        Optional<Course> c1=courseService.getSpecificCourse(id);
        if(c1.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT EXIST...");
        }else return ResponseEntity.ok(c1);
    }

    @PostMapping("/add")
    public String addCourse(@RequestBody Course course){
        courseService.addCourse(course);
        return "Successfully added.....";
    }

    @PutMapping("/update")
    public String updateCourse(@RequestBody Course course){
        courseService.updateCourse(course);
        return "Updated Successfully.....";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable("id") int id){
        courseService.deleteCourse(id);
        return "Deleted Successfully......";
    }


}
