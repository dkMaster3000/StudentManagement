package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 5),
                        21),
                new Student(1L,
                        "John",
                        "jon.jamal@gmail.com",
                        LocalDate.of(2001, Month.APRIL, 5),
                        22)
        );
    }
}
