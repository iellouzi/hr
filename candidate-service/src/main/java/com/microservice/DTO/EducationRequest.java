package com.microservice.DTO;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EducationRequest {


    private String name;

    private Date date_start;

    private Date date_end;

}
