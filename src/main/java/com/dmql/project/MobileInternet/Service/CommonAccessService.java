package com.dmql.project.MobileInternet.Service;

import com.dmql.project.MobileInternet.Entity.Users;
import com.dmql.project.MobileInternet.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommonAccessService {
    @Autowired
    private UserRepository userRepository;

    public List<String> findAllByUserFirstNames(){
        List<Users> users = userRepository.findAll();
        List<String> names = users.stream().map(Users::getFirstName).collect(Collectors.toList());
        return names;
    }
}
