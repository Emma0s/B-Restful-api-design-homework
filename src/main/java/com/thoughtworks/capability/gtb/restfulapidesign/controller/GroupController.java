package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.dto.GroupsDTO;
import com.thoughtworks.capability.gtb.restfulapidesign.model.GroupData;
import com.thoughtworks.capability.gtb.restfulapidesign.service.GroupService;
import com.thoughtworks.capability.gtb.restfulapidesign.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/groups")
public class GroupController {
    private final GroupService groupService;
    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<List<GroupsDTO>> groupStudent(){
        GroupData.clear();
        var students = studentService.findStudents();
        Collections.shuffle(students);
        List<GroupsDTO> groups = groupService.groupStudent();
        for (int stuIndex=0,groupIndex=0; stuIndex<students.size(); stuIndex++){
            if (groupIndex==6) groupIndex=0;
            groups.get(groupIndex).getStudentDTOList().add(students.get(stuIndex));
            groupIndex++;
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(groups);
    }


}
