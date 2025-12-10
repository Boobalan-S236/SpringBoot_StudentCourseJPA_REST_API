package com.example.StudentCourseWithJpa.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.bytecode.enhance.spi.EnhancementInfo;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private int studentId;

    private String studentName;
    private String studentEmail;
    private int rno;

}
