package com.thoughtworks.capability.gtb.restfulapidesign.dto;

import com.thoughtworks.capability.gtb.restfulapidesign.service.AddStudentRequest;
import lombok.*;
import org.springframework.stereotype.Repository;

@Data
@Repository
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private Integer id;
    private String name;
    private String gender;
    private String note;

    public static StudentDTOBuilder buildBaseStudent(Integer id, AddStudentRequest addStudentRequest) {
        return StudentDTO.builder()
                .id(id)
                .name(addStudentRequest.getName())
                .gender(addStudentRequest.getGender())
                .note(addStudentRequest.getNote());
    }


    public StudentDTO buildNewStudent(Integer studentId, AddStudentRequest addStudentRequest) {
        var builder = buildBaseStudent(studentId,addStudentRequest);
        return builder.build();
    }
}
