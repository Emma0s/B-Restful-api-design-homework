package com.thoughtworks.capability.gtb.restfulapidesign.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddStudentRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String gender;
    private String note;
}
