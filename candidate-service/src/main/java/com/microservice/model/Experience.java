package com.microservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "experiences")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty
    private String title;
    @Column(nullable = false)
    private Date date_start;
    @Column(nullable = false)
    private Date date_end;
    @JsonProperty
    private String organization;
    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
