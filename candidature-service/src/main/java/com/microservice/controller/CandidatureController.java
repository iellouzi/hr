package com.microservice.controller;

import com.microservice.DTO.CandidateResponse;
import com.microservice.DTO.CandidatureRequest;
import com.microservice.DTO.CandidatureResponse;
import com.microservice.DTO.OffreResponse;
import com.microservice.model.Candidature;
import com.microservice.service.CandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/candidatures")
public class CandidatureController {

    private final CandidatureService candidatureService;


    @Autowired
    public CandidatureController(CandidatureService candidatureService) {
        this.candidatureService = candidatureService;
    }

    @GetMapping("/home")
    public ResponseEntity<String> sayHello() {

        return new ResponseEntity<>("Hello to candidatures service", HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<CandidatureResponse>> getAllCandidatures() {
        List<CandidatureResponse> candidatureResponses = candidatureService.getAllCandidatures();
        return new ResponseEntity<>(candidatureResponses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CandidatureResponse> getCandidatureById(@PathVariable("id") Long id) {
        CandidatureResponse candidatureResponse = candidatureService.getCandidatureById(id);
        return new ResponseEntity<>(candidatureResponse, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Candidature> createCandidature(@RequestBody CandidatureRequest candidatureRequest) throws Exception {
        Candidature createdCandidature = candidatureService.applyCandidature(candidatureRequest);
        return new ResponseEntity<>(createdCandidature, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Candidature> updateCandidature(
            @PathVariable("id") Long id,
            @RequestBody CandidatureRequest candidatureRequest) {
        Candidature updatedCandidature = candidatureService.updateCandidature(id, candidatureRequest);
        return new ResponseEntity<>(updatedCandidature, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCandidature(@PathVariable("id") Long id) {
        candidatureService.deleteCandidature(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
