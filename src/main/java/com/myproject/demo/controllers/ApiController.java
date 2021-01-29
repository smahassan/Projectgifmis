package com.myproject.demo.controllers;

import com.myproject.demo.entities.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @GetMapping("students")
    // public Students getStudents() for a student
        public ArrayList<Students> getStudents(){

        Students student1 = new Students();
        student1.setMatric_no("IMC/97/1111");
        student1.setCourse("Computer Sc");

        Students student2 = new Students();
        student2.setMatric_no("IMC/97/2222");
        student2.setCourse("Mathematics");

        ArrayList<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);


        return students;

    }

}
