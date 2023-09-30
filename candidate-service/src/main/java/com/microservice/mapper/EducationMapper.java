package com.microservice.mapper;

import com.microservice.DTO.EducationRequest;
import com.microservice.DTO.EducationResponse;
import com.microservice.model.Education;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface EducationMapper {
    Education mapRequestToEntity(EducationRequest request);

    EducationResponse mapEntityToResponse(Education Education);

    void updateEducationFromRequest(EducationRequest request, @MappingTarget Education Education);
}