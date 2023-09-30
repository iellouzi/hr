package com.microservice.service;

import com.microservice.model.Education;
import com.microservice.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EducationService {
    private final EducationRepository educationRepository;

    @Autowired
    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public List<Education> getAllEducations() {
        return educationRepository.findAll();
    }

    public Education getEducationById(Long id) {
        return educationRepository.findById(id).get();
    }

    public Education createEducation(Education education) {
        return educationRepository.save(education);
    }

    public Education updateEducation(Long id, Education educationDetails) {
        Education education = getEducationById(id);

        return educationRepository.save(education);
    }

    public void deleteEducation(Long id) {
        Education education = getEducationById(id);
        educationRepository.delete(education);
    }
}
