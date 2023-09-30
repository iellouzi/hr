package com.microservice.model;

import lombok.*;

import java.util.UUID;

import javax.persistence.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "evaluations")
public class Evaluation {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private Double noteCV;
        @Column(nullable = false)
        private Double noteRH;
        @Column(nullable = false)
        private Double noteTechnique;
        @Column(nullable = false)
        private String description;

}
