package com.trikonas.PolicyManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trikonas.PolicyManagement.model.Policy;

@Repository
public interface PolicyRepo extends JpaRepository<Policy, Integer> {
   
}
