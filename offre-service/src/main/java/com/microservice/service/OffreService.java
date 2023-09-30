package com.microservice.service;

import com.microservice.model.Offre;
import com.microservice.repository.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OffreService {
    private final OffreRepository offreRepository;

    @Autowired
    public OffreService(OffreRepository offreRepository) {
        this.offreRepository = offreRepository;
    }

    public List<Offre> getAllOffres() {
        return offreRepository.findAll();
    }

    public Offre getOffreById(Long id) {
        return offreRepository.findById(id).get();
    }

    public Offre createOffre(Offre offre) {
        return offreRepository.save(offre);
    }

    public Offre updateOffre(Long id, Offre offreDetails) {
        Offre offre = getOffreById(id);
        offre.setOffreTitle(offreDetails.getOffreTitle());
        offre.setExperience(offreDetails.getExperience());
        offre.setDescription(offreDetails.getDescription());
        offre.setSalaire(offreDetails.getSalaire());
        offre.setRequirements(offreDetails.getRequirements());
        return offreRepository.save(offre);
    }

    public void deleteOffre(Long id) {
        Offre offre = getOffreById(id);
        offreRepository.delete(offre);
    }
}
