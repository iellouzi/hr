package com.microservice.mapper;

import com.microservice.DTO.CandidateRequest;
import com.microservice.DTO.CandidateResponse;
import com.microservice.model.Candidate;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
public interface CandidateMapper {
    CandidateMapper INSTANCE = Mappers.getMapper(CandidateMapper.class);
    Candidate mapRequestToEntity(CandidateRequest request);

    CandidateResponse mapEntityToResponse(Candidate Candidate);

    void updateCandidateFromRequest(CandidateRequest request, @MappingTarget Candidate Candidate);
}