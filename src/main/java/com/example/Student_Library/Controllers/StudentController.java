package com.example.Student_Library.Controllers;

import com.example.Student_Library.Models.Card;
import com.example.Student_Library.Models.CardStatus;
import com.example.Student_Library.Models.Student;
import com.example.Student_Library.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    StudentService studentService ;
    @PostMapping("/add")
    public  String createStudent(@RequestBody Student student)
    {
         studentService.createStudent(student) ;
       return "Student and card is Saved" ;
    }
}
