package com.spring.project.coviddashboard.controller;

import com.spring.project.coviddashboard.entity.CovidCases;
import com.spring.project.coviddashboard.repository.CovidCasesRepository;
import com.spring.project.coviddashboard.service.CovidCasesService;
import com.spring.project.coviddashboard.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/covidcases")
public class CovidCasesController {

    @Autowired
    private CovidCasesService covidCasesService;

    @Autowired
    private CovidCasesRepository covidCasesRepository;

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN')")
    public void addCovidCases(@RequestBody CovidCases covidCases) {
        covidCasesService.addCovidCases(covidCases);
    }

    @GetMapping(path="{date}")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public List<CovidCases> getCasesByDate(@PathVariable("date") LocalDate date) {
        return covidCasesService.getCasesByDate(date);
    }

    @GetMapping()
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CovidCases> getCases() {
        return covidCasesRepository.findAll();
    }
}
