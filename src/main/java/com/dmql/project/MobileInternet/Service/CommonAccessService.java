package com.dmql.project.MobileInternet.Service;

import com.dmql.project.MobileInternet.Entity.*;
import com.dmql.project.MobileInternet.Repository.*;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
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

    public List<Users> findAllUsers(int page){
        List<Users> result = userRepository.findAll();
        result.sort(Comparator.comparing(Users::getId));
        if(result.size()>100){
            int start = (page-1)*100;
            int end = (page*100);//assume page size is 100
            end = Math.min(end,result.size()-start);
            result = result.subList(start,start+end);
        }
        return result;
//        List<String> names = users.stream().map(Users::getFirstName).collect(Collectors.toList());
    }

    public List<Plan> findAllPlans(int page){
        List<Plan> result= planRepository.findAll();
        result.sort(Comparator.comparing(Plan::getId));
        if(result.size()>100){
            int start = (page-1)*100;
            int end = (page*100);//assume page size is 100
            end = Math.min(end,result.size()-start);
            result = result.subList(start,start+end);
        }
        return result;
    }

    public List<Coverage> findAllCoverage(int page){
        List<Coverage> result = coverageRepository.findAll();
        result.sort(Comparator.comparing(Coverage::getId));
        if(result.size()>100){
            int start = (page-1)*100;
            int end = (page*100);//assume page size is 100
            end = Math.min(end,result.size()-start);
            result = result.subList(start,start+end);
        }
        return result;
    }
    public List<Usage> findAllUsage(int page){
        List<Usage> result= usageRepository.findAll();
        result.sort(Comparator.comparing(Usage::getId));
        if(result.size()>100){
            int start = (page-1)*100;
            int end = (page*100);//assume page size is 100
            end = Math.min(end,result.size()-start);
            result = result.subList(start,start+end);
        }
        return result;
    }
    public List<ServiceProvider> findAllProviders(int page){
        List<ServiceProvider> result= serviceProviderRepository.findAll();
        result.sort(Comparator.comparing(ServiceProvider::getId));
        if(result.size()>100){
            int start = (page-1)*100;
            int end = (page*100);//assume page size is 100
            end = Math.min(end,result.size()-start);
            result = result.subList(start,start+end);
        }

        return result;
    }

    public Users createOrUpdateUser(Users users){
        if(users.getId()==null){
            //new plan
            return userRepository.save(users);

        }else{//update
            return userRepository.save(users);
        }
    }

    public Coverage createOrUpdateCoverage(Coverage coverage){
        if(coverage.getId()==null){
            //new plan
            return coverageRepository.save(coverage);
        }else{//update
            return coverageRepository.save(coverage);
        }
    }

    public ServiceProvider createOrUpdateProvider(ServiceProvider provider){
        if(provider.getId()==null){
            //new plan
            return serviceProviderRepository.save(provider);

        }else{//update
            return serviceProviderRepository.save(provider);
        }
    }

    public Usage createOrUpdateUsage(Usage usage){
        if(usage.getId()==null){
            //new plan
            return usageRepository.save(usage);
        }else{//update
            return usageRepository.save(usage);
        }
    }

    public Plan createOrUpdatePlan(Plan plan){
        if(plan.getId()==null){
            //new plan
            return planRepository.save(plan);

        }else{//update
            return planRepository.save(plan);
        }
    }

}
