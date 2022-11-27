package com.dmql.project.MobileInternet.Repository;

import com.dmql.project.MobileInternet.Entity.Usage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsageRepository extends JpaRepository<Usage,Integer> {
}
