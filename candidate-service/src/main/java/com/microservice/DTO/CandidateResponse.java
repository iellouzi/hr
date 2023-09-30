package com.microservice.DTO;


import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateResponse {

        private Long id;

        private String name;

        private String phone;

        private String email;

        private List<SkillResponse> skills = new ArrayList<>();

        private List<EducationResponse> education = new ArrayList<>();

        private List<ExperienceResponse> experience ;

}
