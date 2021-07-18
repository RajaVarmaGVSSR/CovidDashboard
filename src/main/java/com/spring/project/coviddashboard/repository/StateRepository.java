package com.spring.project.coviddashboard.repository;

import com.spring.project.coviddashboard.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State,Integer> {

}
