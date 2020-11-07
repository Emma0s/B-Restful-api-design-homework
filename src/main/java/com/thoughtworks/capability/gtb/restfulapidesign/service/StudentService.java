package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.dto.StudentDTO;
import com.thoughtworks.capability.gtb.restfulapidesign.model.StudentData;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void deleteStudent(Integer studentId) {
        studentData.deleteStudent(studentId);
    }

    public List<StudentDTO> findStudents() {
        return studentData.getStudents();
    }

    public List<StudentDTO> findStudentsByGender(String gender) {
        return studentData.getStudentsByGender(gender);
    }

    public StudentDTO getStudentById(Integer studentId) {
        return studentData.getStudentDataById(studentId);
    }

    public StudentDTO updateStudent(Integer studentId, UpdateStudentRequest request) {
        return studentData.updateStudentData(studentId,request);
    }
}
