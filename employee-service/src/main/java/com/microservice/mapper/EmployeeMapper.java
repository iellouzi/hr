package com.microservice.mapper;

import com.microservice.DTO.EmployeeRequest;
import com.microservice.DTO.EmployeeResponse;
import com.microservice.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Employee mapRequestToEntity(EmployeeRequest employeeRequest);

    EmployeeResponse mapEntityToResponse(Employee Employee);

    void updateEmployeeFromRequest(EmployeeRequest employeeRequest, @MappingTarget Employee Employee);
}