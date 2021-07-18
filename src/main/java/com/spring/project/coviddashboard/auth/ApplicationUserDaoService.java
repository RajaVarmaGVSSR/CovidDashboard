package com.spring.project.coviddashboard.auth;

import com.google.common.collect.Lists;
import com.spring.project.coviddashboard.repository.UserRepository;
import com.spring.project.coviddashboard.security.ApplicationUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("DAO")
public class ApplicationUserDaoService implements ApplicationUserDao {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public ApplicationUserDaoService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<ApplicationUser> selecApplicationUserByUsername(String username) {
        Optional<ApplicationUser> applicationUser = userRepository.findByUsername(username);
        return applicationUser;
    }



}
