package com.microservice.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidatures")
public class Candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long candidateId;
    @Column(nullable = false)
    private Long offreId;

    private Long evaluationId;

    @Column(nullable = false)
    private Status status;

    private String creationDate;
}
