package com.trikonas.PolicyManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trikonas.PolicyManagement.model.Coverage;

@Repository
public interface CoverageRepo extends JpaRepository<Coverage, Integer> {
   
}