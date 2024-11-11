package com.trikonas.PolicyManagement.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="coverage")
public class Coverage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="coverage_id")
	private Integer id;
	
	@Column(name="Coverage_limit")
	private BigDecimal limit;
	
	@Column(name="Coverage_type")
	private String type;
	
	@ManyToOne
    @JoinColumn(name = "Pid")  
    private Policy policy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getLimit() {
		return limit;
	}

	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	
}
	
	
	