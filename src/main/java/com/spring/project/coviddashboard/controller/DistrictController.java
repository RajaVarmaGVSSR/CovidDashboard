package com.spring.project.coviddashboard.controller;

import com.spring.project.coviddashboard.entity.District;
import com.spring.project.coviddashboard.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @GetMapping("/districtsByState")
    public List<District> getDistrictByState(@RequestParam Integer state_id) {
        System.out.println(" State Input :  " + state_id);
        return districtService.getDistrictById(state_id);
    }

    @GetMapping("/districts")
    public List<District> getDistricts() {
        return districtService.getDistricts();
    }

}
