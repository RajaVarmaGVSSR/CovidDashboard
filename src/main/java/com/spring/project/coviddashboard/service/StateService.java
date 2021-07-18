package com.spring.project.coviddashboard.service;

import com.spring.project.coviddashboard.entity.State;
import com.spring.project.coviddashboard.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> getStates() {
        return stateRepository.findAll();
    }


}
