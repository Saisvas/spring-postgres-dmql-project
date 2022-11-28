package com.dmql.project.MobileInternet.Controller;

import com.dmql.project.MobileInternet.Entity.*;
import com.dmql.project.MobileInternet.Service.CommonAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/data", produces="application/json")

public class CommonAccessController {
    @Autowired
    private CommonAccessService commonAccessService;



    @GetMapping("/allUsers")
    @ResponseBody
    public ResponseEntity<List<Users>> allUsers() {
        return  ResponseEntity.ok(commonAccessService.findAllUsers());
    }

    @GetMapping("/allServiceProviders")
    @ResponseBody
    public ResponseEntity<List<ServiceProvider>> allServiceProviders() {
        return  ResponseEntity.ok(commonAccessService.findAllProviders());
    }

    @GetMapping("/allUsage")
    @ResponseBody
    public ResponseEntity<List<Usage>> allUsage() {
        return  ResponseEntity.ok(commonAccessService.findAllUsage());
    }

    @GetMapping("/allPlans")
    @ResponseBody
    public ResponseEntity<List<Plan>> allPlans() {
        return  ResponseEntity.ok(commonAccessService.findAllPlans());
    }

    @GetMapping("/allCoverage")
    @ResponseBody
    public ResponseEntity<List<Coverage>> allCoverage() {
        return  ResponseEntity.ok(commonAccessService.findAllCoverage());
    }

    @PostMapping("/createOrUpdatePlan")
    public ResponseEntity createOrUpdatePlan(@RequestBody Plan plan){
        return ResponseEntity.ok(commonAccessService.createOrUpdatePlan(plan));
    }
}
