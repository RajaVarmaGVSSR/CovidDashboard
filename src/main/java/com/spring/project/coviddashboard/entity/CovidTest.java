package com.spring.project.coviddashboard.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="covidtest")
public class CovidTest {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="pid")
    private Patient patient;

    @Column(name="testdate")
    private LocalDate testdate;

    @Column(name="resultdate")
    private LocalDate resultdate;

    @Column(name="result")
    private String result;

    public CovidTest() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getTestdate() {
        return testdate;
    }

    public void setTestdate(LocalDate localDate) {
        this.testdate = localDate;
    }

    public LocalDate getResultdate() {
        return resultdate;
    }

    public void setResultdate(LocalDate localDate) {
        this.resultdate = localDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CovidTest [id=" + id + ", patient=" + patient + ", testdate=" + testdate + ", resultdate=" + resultdate
                + ", result=" + result + "]";
    }

}
