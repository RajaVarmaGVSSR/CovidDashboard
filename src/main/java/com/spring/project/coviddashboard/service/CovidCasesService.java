package com.spring.project.coviddashboard.service;

import com.spring.project.coviddashboard.entity.CovidCases;
import com.spring.project.coviddashboard.repository.CovidCasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class CovidCasesService {

    @Autowired
    private CovidCasesRepository covidCasesRepository;

    public void addCovidCases(CovidCases covidCases) {
        covidCasesRepository.save(covidCases);
    }

    public List<CovidCases> getCasesByDate(LocalDate date) {
        List<CovidCases> covidCases = covidCasesRepository.findByDate(date);
        return covidCases;
    }
}
