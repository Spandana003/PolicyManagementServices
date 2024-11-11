package com.trikonas.PolicyManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trikonas.PolicyManagement.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    
}