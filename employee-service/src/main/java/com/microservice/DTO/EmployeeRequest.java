package com.microservice.DTO;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private String department;
    private String position;
    private String salary;
}

