package com.spring.project.coviddashboard.repository;

import com.spring.project.coviddashboard.entity.CovidCases;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CovidCasesRepository extends JpaRepository<CovidCases, Integer> {
    List<CovidCases> findByDate(LocalDate date);
}
