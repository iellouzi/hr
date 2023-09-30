package com.microservice.repository;

import com.microservice.model.Candidature;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;

@Repository
public interface CandidatureRepository extends JpaRepository<Candidature, Long> {
}
