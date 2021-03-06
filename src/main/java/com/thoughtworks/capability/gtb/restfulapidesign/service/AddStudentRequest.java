package com.thoughtworks.capability.gtb.restfulapidesign.service;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
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
