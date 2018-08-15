package com.dashboard.service;

import com.dashboard.model.User;
import com.dashboard.web.dto.UserRegistrationDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
