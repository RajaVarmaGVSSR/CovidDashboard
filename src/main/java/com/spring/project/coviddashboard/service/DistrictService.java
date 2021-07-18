package com.spring.project.coviddashboard.service;

import com.spring.project.coviddashboard.entity.District;
import com.spring.project.coviddashboard.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    public List<District> getDistrictById(Integer id) {
        return districtRepository.findByStateId(id);
    }

    public List<District> getDistricts() {
        return districtRepository.findAll();
    }


}
