package com.microservice.model;

import lombok.*;

import javax.persistence.Entity;;
import java.util.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidates")
public class Candidate {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private String name;
        @Column(nullable = false)
        private String phone;
        @Column(nullable = false)
        private String email;

}
