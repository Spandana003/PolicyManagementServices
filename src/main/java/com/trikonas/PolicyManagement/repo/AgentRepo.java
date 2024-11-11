package com.trikonas.PolicyManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trikonas.PolicyManagement.model.Agent;

@Repository
public interface AgentRepo extends JpaRepository<Agent, Integer> {
    
}