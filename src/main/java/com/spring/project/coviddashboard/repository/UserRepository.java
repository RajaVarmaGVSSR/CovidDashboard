package com.spring.project.coviddashboard.repository;

import com.spring.project.coviddashboard.auth.ApplicationUser;
import com.spring.project.coviddashboard.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser,Integer> {
    Optional<ApplicationUser> findByUsername(String username);
}
