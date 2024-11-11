package com.trikonas.PolicyManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trikonas.PolicyManagement.model.Agency;

@Repository
public interface AgencyRepo extends JpaRepository<Agency, Integer> {
    
}