package com.microservice.mapper;

import com.microservice.DTO.ExperienceRequest;
import com.microservice.DTO.ExperienceResponse;
import com.microservice.model.Experience;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ExperienceMapper {
    Experience mapRequestToEntity(ExperienceRequest request);

    ExperienceResponse mapEntityToResponse(Experience Experience);

    void updateExperienceFromRequest(ExperienceRequest request, @MappingTarget Experience Experience);
}