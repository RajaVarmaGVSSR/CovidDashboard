package com.spring.project.coviddashboard.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="pid")
    private Integer pid;

    @Column(name="pname")
    private String pname;

    @Column(name="page")
    private Integer page;

    @Column(name="pgender")
    private String pgender;

    @Column(name="email")
    private String email;

    @Column(name="status")
    private String status;

    @Column(name="reportdate")
    private LocalDate reportdate;

    @ManyToOne()
    @JoinColumn(name="district_id")
    private District district;

    @ManyToOne()
    @JoinColumn(name="state_id")
    private State state;

    public Patient() {

    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getReportdate() {
        return reportdate;
    }

    public void setReportdate(LocalDate reportdate) {
        this.reportdate = reportdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Patient [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pgender=" + pgender + ", district="
                + district + ", state=" + state + "]";
    }

}
