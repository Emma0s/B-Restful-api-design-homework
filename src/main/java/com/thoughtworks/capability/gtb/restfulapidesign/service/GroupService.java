package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.dto.GroupsDTO;
import com.thoughtworks.capability.gtb.restfulapidesign.model.GroupData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    private final GroupData groupData;

    public GroupService(GroupData groupData) {
        this.groupData = groupData;
    }

    public List<GroupsDTO> groupStudent() {
        return groupData.groupStudent();
    }
}
