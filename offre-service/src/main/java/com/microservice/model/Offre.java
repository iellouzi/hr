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
@Table(name = "offres")
public class Offre {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private String offreTitle;
        @Column(nullable = false)
        private String Description;
        @Column(nullable = false)
        private String requirements;
        @Column(nullable = false)
        private int experience;
        @Column(nullable = false)
        private double salaire;

}
