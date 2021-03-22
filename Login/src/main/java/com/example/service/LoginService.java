package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.model.LoginUser;
import com.example.repo.LoginRepo;


@Service
public class LoginService 
{
@Autowired
private LoginRepo repo;

public LoginUser saveuser(LoginUser user) {
    return repo.save(user);
}


public LoginUser getEmail(String email) {
    return repo.findByEmail(email);
}
}
