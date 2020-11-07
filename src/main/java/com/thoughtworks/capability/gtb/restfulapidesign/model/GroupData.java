package com.thoughtworks.capability.gtb.restfulapidesign.model;

import com.thoughtworks.capability.gtb.restfulapidesign.dto.GroupsDTO;
import com.thoughtworks.capability.gtb.restfulapidesign.dto.StudentDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GroupData {

    private static final List<GroupsDTO> groupsDTOList = new ArrayList<>();
    private static final boolean isInitialed = false;
    private static void initGroups() {
        List<StudentDTO> team1Student = new ArrayList<>();
        GroupsDTO groupsDTO1 = new GroupsDTO(1, "team1", "", team1Student);
        List<StudentDTO> team2Student = new ArrayList<>();
        GroupsDTO groupsDTO2 = new GroupsDTO(2, "team2", "", team2Student);
        List<StudentDTO> team3Student = new ArrayList<>();
        GroupsDTO groupsDTO3 = new GroupsDTO(3, "team3", "", team3Student);
        List<StudentDTO> team4Student = new ArrayList<>();
        GroupsDTO groupsDTO4 = new GroupsDTO(4, "team4", "", team4Student);
        List<StudentDTO> team5Student = new ArrayList<>();
        GroupsDTO groupsDTO5 = new GroupsDTO(5, "team5", "", team5Student);
        List<StudentDTO> team6Student = new ArrayList<>();
        GroupsDTO groupsDTO6 = new GroupsDTO(6, "team6", "", team6Student);
        groupsDTOList.add(groupsDTO1);
        groupsDTOList.add(groupsDTO2);
        groupsDTOList.add(groupsDTO3);
        groupsDTOList.add(groupsDTO4);
        groupsDTOList.add(groupsDTO5);
        groupsDTOList.add(groupsDTO6);
    }

    public static void clear() {
        groupsDTOList.clear();
    }

    public List<GroupsDTO> groupStudent() {
        if (!isInitialed) initGroups();
        return groupsDTOList;
    }
}
