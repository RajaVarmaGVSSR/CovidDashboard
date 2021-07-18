package com.spring.project.coviddashboard.controller;

import com.spring.project.coviddashboard.auth.ApplicationUserService;
import com.spring.project.coviddashboard.dto.ApplicationUserDTO;
import com.spring.project.coviddashboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationUserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody ApplicationUserDTO applicationUserDTO) {
        userService.addApplicationUser(applicationUserDTO);
    }

}
