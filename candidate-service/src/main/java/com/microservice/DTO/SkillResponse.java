package com.microservice.DTO;

import com.microservice.model.Candidate;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
public class SkillResponse {
    private Long id;
    private String name;

}
