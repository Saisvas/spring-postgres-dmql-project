package com.dmql.project.MobileInternet.Repository;


import com.dmql.project.MobileInternet.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    List<Users> findAllByFirstNameLike(String firstName);
}
