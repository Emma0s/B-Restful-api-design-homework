package com.thoughtworks.capability.gtb.restfulapidesign.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Repository
@Builder
public class GroupsDTO {
    private Integer id;
    private String name;
    private String note;
    private List<StudentDTO> studentDTOList;
}
