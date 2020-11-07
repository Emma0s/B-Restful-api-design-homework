package com.thoughtworks.capability.gtb.restfulapidesign.controller;


import com.thoughtworks.capability.gtb.restfulapidesign.dto.StudentDTO;
import com.thoughtworks.capability.gtb.restfulapidesign.service.AddStudentRequest;
import com.thoughtworks.capability.gtb.restfulapidesign.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDTO> addNewStudent(@RequestBody @Valid AddStudentRequest addStudentRequest){
        var student =  studentService.addNewStudent(addStudentRequest);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(student);
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity deleteStudent(@PathVariable Integer studentId){
        studentService.deleteStudent(studentId);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
