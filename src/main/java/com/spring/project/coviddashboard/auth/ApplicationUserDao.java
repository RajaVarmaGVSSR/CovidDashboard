package com.spring.project.coviddashboard.auth;

import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface ApplicationUserDao {

    Optional<ApplicationUser> selecApplicationUserByUsername(String username);
}
