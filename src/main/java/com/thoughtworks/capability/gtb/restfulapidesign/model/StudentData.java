package com.thoughtworks.capability.gtb.restfulapidesign.model;

import com.thoughtworks.capability.gtb.restfulapidesign.dto.StudentDTO;
import com.thoughtworks.capability.gtb.restfulapidesign.service.AddStudentRequest;
import com.thoughtworks.capability.gtb.restfulapidesign.service.UpdateStudentRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public void deleteStudent(Integer studentId) {
        studentMap.remove(studentId);
    }

    public List<StudentDTO> getStudents() {
        List<StudentDTO> students = new ArrayList<>();
        studentMap.keySet().stream().forEach(e -> students.add(getStudentDataById(e)));
        return students;
    }

    public List<StudentDTO> getStudentsByGender(String gender) {
        return getStudents().stream().filter(e -> e.getGender().equals(gender)).collect(Collectors.toList());
    }

    public StudentDTO updateStudentData(Integer studentId, UpdateStudentRequest request) {
        AddStudentRequest addStudentRequest = new AddStudentRequest();
        addStudentRequest.setName(request.getName());
        addStudentRequest.setGender(request.getGender());
        addStudentRequest.setNote(request.getNote());
        studentMap.put(studentId, addStudentRequest);
        return getStudentDataById(studentId);
    }
}
