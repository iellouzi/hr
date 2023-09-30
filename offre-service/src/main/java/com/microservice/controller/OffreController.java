package com.microservice.controller;

import com.microservice.model.Offre;
import com.microservice.service.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offres")
public class OffreController {
    private final OffreService offreService;

    @GetMapping("/home")
    public ResponseEntity<String> sayHello() {

        return ResponseEntity.ok("Hello to offres service");
    }

    @Autowired
    public OffreController(OffreService offreService) {
        this.offreService = offreService;
    }

    @GetMapping
    public ResponseEntity<List<Offre>> getAllOffres() {
        List<Offre> offres = offreService.getAllOffres();
        return new ResponseEntity<>(offres, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Offre> getOffreById(@PathVariable("id") Long id) {
        Offre offre = offreService.getOffreById(id);
        return new ResponseEntity<>(offre, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Offre> createOffre(@RequestBody Offre offre) {
        Offre createdOffre = offreService.createOffre(offre);
        return new ResponseEntity<>(createdOffre, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Offre> updateOffre(
            @PathVariable("id") Long id,
            @RequestBody Offre offreDetails) {
        Offre updatedOffre = offreService.updateOffre(id, offreDetails);
        return new ResponseEntity<>(updatedOffre, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOffre(@PathVariable("id") Long id) {
        offreService.deleteOffre(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/{id}/candidate/{id_candidate}/apply")
    public ResponseEntity<Offre> applyForOffre(@PathVariable("id") Long id) {
        Offre offre = offreService.getOffreById(id);
        return new ResponseEntity<>(offre, HttpStatus.OK);
    }
}
