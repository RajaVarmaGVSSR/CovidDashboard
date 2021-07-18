package com.spring.project.coviddashboard.repository;

import com.spring.project.coviddashboard.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District,Integer> {

    List<District> findByStateId(Integer id);

}