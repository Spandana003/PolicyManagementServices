package com.trikonas.PolicyManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trikonas.PolicyManagement.model.RiskAssessment;

@Repository
public interface RiskAssessmentRepo extends JpaRepository<RiskAssessment, Integer> {
    
}