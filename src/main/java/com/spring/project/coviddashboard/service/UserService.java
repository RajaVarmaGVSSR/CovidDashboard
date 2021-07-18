package com.spring.project.coviddashboard.service;

import com.spring.project.coviddashboard.auth.ApplicationUser;
import com.spring.project.coviddashboard.dto.ApplicationUserDTO;
import com.spring.project.coviddashboard.repository.DistrictRepository;
import com.spring.project.coviddashboard.repository.StateRepository;
import com.spring.project.coviddashboard.repository.UserRepository;
import com.spring.project.coviddashboard.security.ApplicationUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private StateRepository stateRepository;

    public void addApplicationUser(ApplicationUserDTO applicationUserDTO) {
        ApplicationUser applicationUser = new ApplicationUser();
        applicationUser.setAccountNonExpired(true);
        applicationUser.setAccountNonLocked(true);
        applicationUser.setCredentialsNonExpired(true);
        applicationUser.setEnabled(true);
        applicationUser.setName(applicationUserDTO.getName());
        applicationUser.setAge(applicationUserDTO.getAge());
        applicationUser.setGender(applicationUserDTO.getGender());
        applicationUser.setRole(ApplicationUserRole.USER.name());
        applicationUser.setDistrict(districtRepository.findById(applicationUserDTO.getDistrict_id()).get());
        applicationUser.setState(stateRepository.findById(applicationUserDTO.getState_id()).get());
        applicationUser.setUsername(applicationUserDTO.getUsername());
        applicationUser.setPassword(passwordEncoder.encode(applicationUserDTO.getPassword()));
        userRepository.save(applicationUser);
    }



}
