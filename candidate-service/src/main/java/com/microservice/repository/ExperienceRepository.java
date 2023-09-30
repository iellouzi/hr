package com.microservice.repository;

import com.microservice.model.Candidate;
import com.microservice.model.Education;
import com.microservice.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {

    List<Experience> findExperiencesByCandidate(Candidate candidate);
}
