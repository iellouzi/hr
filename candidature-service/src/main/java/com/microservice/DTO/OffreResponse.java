package com.microservice.DTO;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor

public class OffreResponse {

        private Long id;

        private String offreTitle;

        private String Description;

        private String requirements;

        private int experience;

        private double salaire;

}
