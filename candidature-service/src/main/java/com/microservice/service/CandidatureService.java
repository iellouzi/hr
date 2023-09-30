package com.microservice.service;

import com.microservice.DTO.CandidateResponse;
import com.microservice.DTO.CandidatureRequest;
import com.microservice.DTO.CandidatureResponse;
import com.microservice.DTO.OffreResponse;
import com.microservice.mapper.CandidatureMapper;
import com.microservice.model.Candidature;
import com.microservice.model.Status;
import com.microservice.repository.CandidatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CandidatureService {
    private final CandidatureRepository candidatureRepository;

    private final RestTemplate restTemplate;

    @Autowired
    public CandidatureService(RestTemplate restTemplate, CandidatureRepository candidatureRepository) {
        this.restTemplate = restTemplate;
        this.candidatureRepository = candidatureRepository;
    }
    public List<CandidatureResponse> getAllCandidatures() {
        List<Candidature> candidatures = candidatureRepository.findAll();

        return candidatures.stream().map(candidature ->
                CandidatureMapper.INSTANCE.mapEntityToResponse(candidature)).collect(Collectors.toList());
    }

    public CandidatureResponse getCandidatureById(Long id) {
        return CandidatureMapper.INSTANCE.mapEntityToResponse(candidatureRepository.findById(id).get());
    }

    public Candidature applyCandidature(CandidatureRequest candidateRequest) throws Exception {
        String candidateUrl = "http://localhost:8054/api/candidates/" + candidateRequest.getCandidateId();
        ResponseEntity<CandidateResponse> candidateResponse = restTemplate.getForEntity(candidateUrl, CandidateResponse.class);
        if (candidateResponse.getStatusCode() != HttpStatus.OK) {
            throw new Exception("Candidate not found");
        }
        String offerUrl = "http://localhost:8054/api/offres/" + candidateRequest.getOffreId();
        ResponseEntity<OffreResponse> offerResponse = restTemplate.getForEntity(offerUrl, OffreResponse.class);
        if (offerResponse.getStatusCode() != HttpStatus.OK) {
            throw new Exception("Offer not found");
        }
        Candidature candidature =CandidatureMapper.INSTANCE.mapRequestToEntity(candidateRequest);

        candidature.setStatus(Status.NEW);
        return candidatureRepository.save(candidature);
    }
    public Candidature updateCandidature(Long id, CandidatureRequest candidateRequest) {
        Candidature candidature = candidatureRepository.findById(id).get();

        return candidatureRepository.save(candidature);
    }

    public void deleteCandidature(Long id) {
        Candidature candidature = candidatureRepository.findById(id).get();
        candidatureRepository.delete(candidature);
    }
}
