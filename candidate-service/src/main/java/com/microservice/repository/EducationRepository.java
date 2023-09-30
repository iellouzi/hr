package com.microservice.repository;

import com.microservice.model.Candidate;
import com.microservice.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {

    List<Education> findEducationsByCandidate(Candidate candidate);

}
