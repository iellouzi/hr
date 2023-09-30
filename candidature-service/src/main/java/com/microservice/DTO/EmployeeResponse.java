package com.microservice.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EmployeeResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private String department;
    private String position;
    private String salary;
}
