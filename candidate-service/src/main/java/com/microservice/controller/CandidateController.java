package com.microservice.controller;

import com.microservice.DTO.CandidateRequest;
import com.microservice.DTO.CandidateResponse;
import com.microservice.model.Candidate;
import com.microservice.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
    private final CandidateService candidateService;

    @GetMapping("/home")
    public ResponseEntity<String> sayHello() {

        return ResponseEntity.ok("Hello to candidates service");
    }
    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping
    public ResponseEntity<List<CandidateResponse>> getAllCandidates() {
        List<CandidateResponse> candidates = candidateService.getAllCandidates();
        return new ResponseEntity<>(candidates, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CandidateResponse> getCandidateById(@PathVariable("id") Long id) {
        CandidateResponse candidate = candidateService.getCandidateById(id);
        return new ResponseEntity<>(candidate, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Candidate> createCandidate(@RequestBody CandidateRequest candidateRequest) {
        Candidate createdCandidate = candidateService.createCandidate(candidateRequest);
        return new ResponseEntity<>(createdCandidate, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Candidate> updateCandidate(
            @PathVariable("id") Long id,
            @RequestBody  CandidateRequest candidateRequest) {
        Candidate updatedCandidate = candidateService.updateCandidate(id, candidateRequest);
        return new ResponseEntity<>(updatedCandidate, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCandidate(@PathVariable("id") Long id) {
        candidateService.deleteCandidate(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}}
