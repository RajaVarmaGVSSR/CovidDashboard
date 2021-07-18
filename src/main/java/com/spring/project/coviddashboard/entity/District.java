package com.spring.project.coviddashboard.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="district")
public class District {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="total")
    private int total;

    @Column(name="active")
    private int active;

    @Column(name="recovered")
    private int recovered;

    @Column(name="deceased")
    private int deceased;


    @ManyToOne()
    @JoinColumn(name="state_id")
    private State state;

    public District() {

    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getTotal() {
        return total;
    }


    public void setTotal(int total) {
        this.total = total;
    }


    public int getActive() {
        return active;
    }


    public void setActive(int active) {
        this.active = active;
    }


    public int getRecovered() {
        return recovered;
    }


    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }





    public int getDeceased() {
        return deceased;
    }


    public void setDeceased(int deceased) {
        this.deceased = deceased;
    }


    public State getState() {
        return state;
    }


    public void setState(State state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "District [id=" + id + ", name=" + name + ", total=" + total + ", active=" + active + ", recovered="
                + recovered + "]";
    }
}
