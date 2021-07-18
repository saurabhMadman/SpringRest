package com.example.demo.rest;


import com.example.demo.pojo.Address;
import com.example.demo.pojo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @GetMapping("/students")
    private List<Student> getStudent(){
        List<Student> students = new ArrayList<Student>();
        String[] grades = {"A+","B-","A"};
        String[] subjects = {"Physics","Chemistry","Maths"};
        Address address = new Address("Flat No, 2b","Ravi Darshan Appartment",55548,"Gujarat","India");
        Student student = new Student("Saurabh", "Verma" , grades,subjects,address);
        students.add(student);
        return students;
    }
}
