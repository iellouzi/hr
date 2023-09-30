package com.microservice.DTO;

import lombok.*;

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
