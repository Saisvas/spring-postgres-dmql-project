package com.dmql.project.MobileInternet.Repository;

import com.dmql.project.MobileInternet.Entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<Plan,Integer> {
}
