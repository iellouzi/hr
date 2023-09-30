package com.microservice.DTO;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EducationResponse {

    private Long id;

    private String name;

    private Date date_start;

    private Date date_end;

}
