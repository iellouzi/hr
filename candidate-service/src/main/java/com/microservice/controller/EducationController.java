package com.microservice.controller;

import com.microservice.model.Education;
import com.microservice.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/educations")
public class EducationController {
    private final EducationService educationService;

    @Autowired
    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping
    public ResponseEntity<List<Education>> getAllEducations() {
        List<Education> educations = educationService.getAllEducations();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Education> getEducationById(@PathVariable("id") Long id) {
        Education education = educationService.getEducationById(id);
        return new ResponseEntity<>(education, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Education> createEducation(@RequestBody Education education) {
        Education createdEducation = educationService.createEducation(education);
        return new ResponseEntity<>(createdEducation, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Education> updateEducation(
            @PathVariable("id") Long id,
            @RequestBody Education educationDetails) {
        Education updatedEducation = educationService.updateEducation(id, educationDetails);
        return new ResponseEntity<>(updatedEducation, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEducation(@PathVariable("id") Long id) {
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
