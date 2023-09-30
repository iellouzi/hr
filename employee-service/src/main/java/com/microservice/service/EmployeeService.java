package com.microservice.service;

import com.microservice.DTO.EmployeeRequest;
import com.microservice.DTO.EmployeeResponse;
import com.microservice.mapper.EmployeeMapper;
import com.microservice.model.Employee;
import com.microservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeResponse> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(employee ->
                EmployeeMapper.INSTANCE.mapEntityToResponse(employee)).collect(Collectors.toList());
    }

    public EmployeeResponse getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee == null) {
            return null;
        }
        return EmployeeMapper.INSTANCE.mapEntityToResponse(employee);
    }


    public Employee createEmployee(EmployeeRequest employeeRequest) {
        Employee employee = EmployeeMapper.INSTANCE.mapRequestToEntity(employeeRequest);
        return employeeRepository.save(employee);
    }


    public Employee updateEmployee(Long id, EmployeeRequest employeeRequest) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee == null) {
            return null;
        }
        EmployeeMapper.INSTANCE.updateEmployeeFromRequest(employeeRequest,employee);
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee == null) {
            return;
        }
        employeeRepository.delete(employee);
    }
}
