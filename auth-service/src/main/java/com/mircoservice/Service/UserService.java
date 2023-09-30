package com.mircoservice.Service;


import com.mircoservice.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User saveUser(User user) ;
    User getUserByUserName(String username) ;
    void addRoleToUser(String username  , String roleNAme) ;
    List<User> getUsers() ;
}
