package com.spring.project.coviddashboard.controller;

import com.spring.project.coviddashboard.entity.State;
import com.spring.project.coviddashboard.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping("/states")
    public List<State> getStates() {
        List<State> states = stateService.getStates();
        return states;
    }

}
