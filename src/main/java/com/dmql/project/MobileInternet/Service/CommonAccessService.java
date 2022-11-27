package com.dmql.project.MobileInternet.Service;

import com.dmql.project.MobileInternet.Entity.*;
import com.dmql.project.MobileInternet.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommonAccessService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CoverageRepository coverageRepository;
    @Autowired
    private ServiceProviderRepository serviceProviderRepository;
    @Autowired
    private PlanRepository planRepository;
    @Autowired
    private UsageRepository usageRepository;

    public List<Users> findAllUsers(){
        return userRepository.findAll();
//        List<String> names = users.stream().map(Users::getFirstName).collect(Collectors.toList());
    }

    public List<Plan> findAllPlans(){
        return planRepository.findAll();
    }
    public List<Coverage> findAllCoverage(){
        return coverageRepository.findAll();
    }
    public List<Usage> findAllUsage(){
        return usageRepository.findAll();
    }
    public List<ServiceProvider> findAllProviders(){
        return serviceProviderRepository.findAll();
    }

}
