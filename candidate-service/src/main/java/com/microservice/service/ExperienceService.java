package com.microservice.service;

import com.microservice.model.Experience;
import com.microservice.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExperienceService {
    private final ExperienceRepository experienceRepository;

    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }

    public Experience getExperienceById(Long id) {
        return experienceRepository.findById(id).get();
    }

    public Experience createExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    public Experience updateExperience(Long id, Experience experienceDetails) {
        Experience experience = getExperienceById(id);

        return experienceRepository.save(experience);
    }

    public void deleteExperience(Long id) {
        Experience experience = getExperienceById(id);
        experienceRepository.delete(experience);
    }
}
