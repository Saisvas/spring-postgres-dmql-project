package com.dmql.project.MobileInternet.Controller;

import com.dmql.project.MobileInternet.Service.CommonAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommonAccessController {
    @Autowired
    private CommonAccessService commonAccessService;

    @GetMapping("/allUserNames")
    public List<String> test(){
        return commonAccessService.findAllByUserFirstNames();
    }
}
