package com.microservice.model;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
        @Column(nullable = false)
        @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
        private List<Skill> skills = new ArrayList<>();
        @Column(nullable = false)
        @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
        private List<Education> education = new ArrayList<>();
        @Column(nullable = false)
        @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
        private List<Experience> experience ;

}
