package com.thoughtworks.capability.gtb.restfulapidesign.dto;

import lombok.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Getter
@Setter
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
