package com.spring.project.coviddashboard.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="covidcases")
public class CovidCases {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="date")
    private LocalDate date;

    @Column(name="positive")
    private Integer positive;

    @Column(name="recovered")
    private Integer recovered;

    @Column(name="deceased")
    private Integer deceased;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getPositive() {
        return positive;
    }

    public void setPositive(Integer positive) {
        this.positive = positive;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getDeceased() {
        return deceased;
    }

    public void setDeceased(Integer deceased) {
        this.deceased = deceased;
    }

    public CovidCases(Integer id, LocalDate date, Integer positive, Integer recovered, Integer deceased) {
        this.id = id;
        this.date = date;
        this.positive = positive;
        this.recovered = recovered;
        this.deceased = deceased;
    }
}
