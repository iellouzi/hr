package com.microservice.service;

import com.microservice.model.Evaluation;
import com.microservice.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EvaluationService {
    private final EvaluationRepository evaluationRepository;

    @Autowired
    public EvaluationService(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    public List<Evaluation> getAllEvaluations() {
        return evaluationRepository.findAll();
    }

    public Evaluation getEvaluationById(Long id) {
        return evaluationRepository.findById(id).get();
    }

    public Evaluation createEvaluation(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    public Evaluation updateEvaluation(Long id, Evaluation evaluationDetails) {
        Evaluation evaluation = getEvaluationById(id);
        evaluation.setDescription(evaluationDetails.getDescription());
        evaluation.setNoteCV(evaluationDetails.getNoteCV());
        evaluation.setNoteRH(evaluationDetails.getNoteRH());
        evaluation.setNoteTechnique(evaluationDetails.getNoteTechnique());
        return evaluationRepository.save(evaluation);
    }

    public void deleteEvaluation(Long id) {
        Evaluation evaluation = getEvaluationById(id);
        evaluationRepository.delete(evaluation);
    }
}
