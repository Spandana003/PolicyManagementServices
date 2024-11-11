package com.trikonas.PolicyManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trikonas.PolicyManagement.model.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {
    
}