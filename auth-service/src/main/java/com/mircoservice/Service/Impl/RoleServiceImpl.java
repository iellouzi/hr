package com.mircoservice.Service.Impl;

import com.mircoservice.Entity.Role;
import com.mircoservice.Repository.RoleRepository;
import com.mircoservice.Service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository ;


    @Override
    public Role saveRole(Role role) {
        log.info("saving rule   : {} " , role.getName());
        return roleRepository.save( role );
    }
}
