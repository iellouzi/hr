package com.microservice.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceResponse {

    private Long id;

    private String title;

    private Date date_start;

    private Date date_end;

    private String organization;

}
