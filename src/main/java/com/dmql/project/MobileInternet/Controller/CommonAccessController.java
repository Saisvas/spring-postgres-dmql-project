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
    public ResponseEntity<List<Users>> allUsers(@RequestParam("page") int page) {
        return  ResponseEntity.ok(commonAccessService.findAllUsers(page));
    }

    @GetMapping("/allServiceProviders")
    @ResponseBody
    public ResponseEntity<List<ServiceProvider>> allServiceProviders(@RequestParam("page") int page) {
        return  ResponseEntity.ok(commonAccessService.findAllProviders(page));
    }

    @GetMapping("/allUsage")
    @ResponseBody
    public ResponseEntity<List<Usage>> allUsage(@RequestParam("page") int page) {
        return  ResponseEntity.ok(commonAccessService.findAllUsage(page));
    }

    @GetMapping("/allPlans")
    @ResponseBody
    public ResponseEntity<List<Plan>> allPlans(@RequestParam("page") int page) {
        return  ResponseEntity.ok(commonAccessService.findAllPlans(page));
    }

    @GetMapping("/allCoverage")
    @ResponseBody
    public ResponseEntity<List<Coverage>> allCoverage(@RequestParam("page") int page) {
        return  ResponseEntity.ok(commonAccessService.findAllCoverage(page));
    }

    @PostMapping("/createOrUpdatePlan")
    public ResponseEntity createOrUpdatePlan(@RequestBody Plan plan){
        return ResponseEntity.ok(commonAccessService.createOrUpdatePlan(plan));
    }
    @PostMapping("/createOrUpdateProvider")
    public ResponseEntity createOrUpdateProvider(@RequestBody ServiceProvider serviceProvider){
        return ResponseEntity.ok(commonAccessService.createOrUpdateProvider(serviceProvider));
    }
    @PostMapping("/createOrUpdateUsage")
    public ResponseEntity createOrUpdateUsage(@RequestBody Usage usage){
        return ResponseEntity.ok(commonAccessService.createOrUpdateUsage(usage));
    }
    @PostMapping("/createOrUpdateUser")
    public ResponseEntity createOrUpdateUser(@RequestBody Users users){
        return ResponseEntity.ok(commonAccessService.createOrUpdateUser(users));
    }
    @PostMapping("/createOrUpdateCoverage")
    public ResponseEntity createOrUpdateCoverage(@RequestBody Coverage coverage){
        return ResponseEntity.ok(commonAccessService.createOrUpdateCoverage(coverage));
    }
}
