package com.trikonas.PolicyManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trikonas.PolicyManagement.model.Claim;

@Repository
public interface ClaimRepo extends JpaRepository<Claim, Integer> {
    
}