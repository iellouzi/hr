package com.microservice.mapper;

import com.microservice.DTO.SkillRequest;
import com.microservice.DTO.SkillResponse;
import com.microservice.model.Skill;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface SkillMapper {
    Skill mapRequestToEntity(SkillRequest request);

    SkillResponse mapEntityToResponse(Skill Skill);

    void updateSkillFromRequest(SkillRequest request, @MappingTarget Skill Skill);
}