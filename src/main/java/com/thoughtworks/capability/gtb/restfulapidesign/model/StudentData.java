package com.thoughtworks.capability.gtb.restfulapidesign.model;

import com.thoughtworks.capability.gtb.restfulapidesign.dto.StudentDTO;
import com.thoughtworks.capability.gtb.restfulapidesign.service.AddStudentRequest;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentData {

    private static final Map<Integer, AddStudentRequest> studentMap = new HashMap<>();
    private static Integer count = 0;
    private final StudentDTO studentDTO;

    public StudentData(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    public Integer addStudent(AddStudentRequest addStudentRequest) {
        studentMap.put(count++, addStudentRequest);
        return count-1;
    }


    public StudentDTO getStudentDataById(Integer studentId) {
         return studentDTO.buildNewStudent(studentId, studentMap.get(studentId));
    }

}
