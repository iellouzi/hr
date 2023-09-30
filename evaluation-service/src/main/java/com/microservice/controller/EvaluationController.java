package com.microservice.controller;

import com.microservice.model.Evaluation;
import com.microservice.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evaluations")
public class EvaluationController {
    private final EvaluationService evaluationService;

    @GetMapping("/home")
    public ResponseEntity<String> sayHello() {

        return ResponseEntity.ok("Hello to evaluations service");
    }

    @Autowired
    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @GetMapping
    public ResponseEntity<List<Evaluation>> getAllEvaluations() {
        List<Evaluation> evaluations = evaluationService.getAllEvaluations();
        return new ResponseEntity<>(evaluations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evaluation> getEvaluationById(@PathVariable("id") Long id) {
        Evaluation evaluation = evaluationService.getEvaluationById(id);
        return new ResponseEntity<>(evaluation, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Evaluation> createEvaluation(@RequestBody Evaluation evaluation) {
        Evaluation createdEvaluation = evaluationService.createEvaluation(evaluation);
        return new ResponseEntity<>(createdEvaluation, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evaluation> updateEvaluation(
            @PathVariable("id") Long id,
            @RequestBody Evaluation evaluationDetails) {
        Evaluation updatedEvaluation = evaluationService.updateEvaluation(id, evaluationDetails);
        return new ResponseEntity<>(updatedEvaluation, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvaluation(@PathVariable("id") Long id) {
        evaluationService.deleteEvaluation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
