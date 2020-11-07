package com.thoughtworks.capability.gtb.restfulapidesign.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateStudentRequest {

    private String name;
    private String gender;
    private String note;
}
