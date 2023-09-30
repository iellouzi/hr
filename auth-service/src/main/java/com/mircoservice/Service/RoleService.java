package com.mircoservice.Service;


import com.mircoservice.Entity.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {

    Role saveRole(Role role) ;

}
