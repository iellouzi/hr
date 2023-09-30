package com.microservice.service;

import com.microservice.DTO.CandidateRequest;
import com.microservice.DTO.CandidateResponse;
import com.microservice.mapper.CandidateMapper;
import com.microservice.model.Candidate;
import com.microservice.model.Education;
import com.microservice.model.Experience;
import com.microservice.model.Skill;
import com.microservice.repository.CandidateRepository;
import com.microservice.repository.EducationRepository;
import com.microservice.repository.ExperienceRepository;
import com.microservice.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CandidateService {
    private final CandidateRepository candidateRepository;

    private final EducationRepository educationRepository;

    private final ExperienceRepository experienceRepository;

    private final SkillRepository skillRepository;
    @Autowired
    public CandidateService(CandidateRepository candidateRepository, EducationRepository educationRepository, ExperienceRepository experienceRepository,SkillRepository skillRepository) {
        this.candidateRepository = candidateRepository;
        this.educationRepository = educationRepository;
        this.experienceRepository = experienceRepository;
        this.skillRepository = skillRepository;
    }

    public List<CandidateResponse> getAllCandidates() {
        List<Candidate> candidates = candidateRepository.findAll();
        candidates.forEach(candidate -> {
            candidate.setEducation(educationRepository.findEducationsByCandidate(candidate));
            candidate.setExperience(experienceRepository.findExperiencesByCandidate(candidate));
            candidate.setSkills(skillRepository.findSkillsByCandidate(candidate));
        });
        return candidates.stream().map(candidate ->
                CandidateMapper.INSTANCE.mapEntityToResponse(candidate)).collect(Collectors.toList());
    }

    public CandidateResponse getCandidateById(Long id) {
        Candidate candidate = candidateRepository.findById(id).orElse(null);
        if (candidate == null) {
            return null;
        }
        candidate.setEducation(educationRepository.findEducationsByCandidate(candidate));
        candidate.setExperience(experienceRepository.findExperiencesByCandidate(candidate));
        candidate.setSkills(skillRepository.findSkillsByCandidate(candidate));
        return CandidateMapper.INSTANCE.mapEntityToResponse(candidate);
    }


    public Candidate createCandidate(CandidateRequest candidateRequest) {
        Candidate candidate = CandidateMapper.INSTANCE.mapRequestToEntity(candidateRequest);
        return candidateRepository.save(candidate);
    }


    public Candidate updateCandidate(Long id, CandidateRequest candidateRequest) {
        Candidate candidate = candidateRepository.findById(id).orElse(null);
        if (candidate == null) {
            return null;
        }
        CandidateMapper.INSTANCE.updateCandidateFromRequest(candidateRequest,candidate);
        return candidateRepository.save(candidate);
    }

    public void deleteCandidate(Long id) {
        Candidate candidate = candidateRepository.findById(id).orElse(null);
        if (candidate == null) {
            return;
        }
        candidateRepository.delete(candidate);
    }
}
