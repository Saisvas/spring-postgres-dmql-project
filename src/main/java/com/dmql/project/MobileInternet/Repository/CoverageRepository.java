package com.dmql.project.MobileInternet.Repository;

import com.dmql.project.MobileInternet.Entity.Coverage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoverageRepository extends JpaRepository<Coverage,Integer> {
}
