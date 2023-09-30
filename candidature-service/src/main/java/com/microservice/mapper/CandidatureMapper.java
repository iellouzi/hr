package com.microservice.mapper;

import com.microservice.DTO.CandidatureRequest;
import com.microservice.DTO.CandidatureResponse;
import com.microservice.model.Candidature;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CandidatureMapper {

    CandidatureMapper INSTANCE = Mappers.getMapper(CandidatureMapper.class);
    Candidature mapRequestToEntity(CandidatureRequest request);

    CandidatureResponse mapEntityToResponse(Candidature Candidature);

    void updateCandidatureFromRequest(CandidatureRequest request, @MappingTarget Candidature Candidature);
}