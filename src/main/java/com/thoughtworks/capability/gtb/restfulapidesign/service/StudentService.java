package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.dto.StudentDTO;
import com.thoughtworks.capability.gtb.restfulapidesign.model.StudentData;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentData studentData;

    public StudentService(StudentData studentData) {
        this.studentData = studentData;
    }

    public StudentDTO addNewStudent(AddStudentRequest addStudentRequest) {
        Integer studentId = studentData.addStudent(addStudentRequest);
        return studentData.getStudentDataById(studentId);
    }
}
