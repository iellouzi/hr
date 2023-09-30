package com.microservice.repository;

import com.microservice.model.Candidate;
import com.microservice.model.Experience;
import com.microservice.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {

    List<Skill> findSkillsByCandidate(Candidate candidate);
}
