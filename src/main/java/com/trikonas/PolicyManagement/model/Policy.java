package com.trikonas.PolicyManagement.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="policy")
public class Policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Policy_id")
	private Integer id;
	
	@Column(name = "Policy_number")
	private Integer policyNum;
	
	@Column(name = "Start_date")
	private Date startDate;
	
	@Column(name = "End_date")
	private Date endDate;
	
	@Column(name = "Premium_amount")
	private BigDecimal premiumAmount;
	
	@Column(name = "Coverage_amount")
	private BigDecimal coverageAmount;
	
	@Enumerated(EnumType.STRING)
    @Column(name = "Policy_type")
    private PolicyType policyType;

    public enum PolicyType {Health,Auto,Life,Property}
    
    @ManyToOne
    @JoinColumn(name = "Cid")
    private User user;
    
    @OneToMany(mappedBy = "policy") 
    private List<Claim> claims;
    
    @OneToMany(mappedBy = "policy")  
    private List<Payment> payments;
    
    @OneToMany(mappedBy = "policy")  
    private List<Coverage> coverages;
    
    @OneToMany(mappedBy = "policy") 
    private List<RiskAssessment> riskAssessments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPolicyNum() {
		return policyNum;
	}

	public void setPolicyNum(Integer policyNum) {
		this.policyNum = policyNum;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(BigDecimal premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public BigDecimal getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(BigDecimal coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	public PolicyType getPolicyType() {
		return policyType;
	}

	public void setPolicyType(PolicyType policyType) {
		this.policyType = policyType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Claim> getClaims() {
		return claims;
	}

	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public List<Coverage> getCoverages() {
		return coverages;
	}

	public void setCoverages(List<Coverage> coverages) {
		this.coverages = coverages;
	}

	public List<RiskAssessment> getRiskAssessments() {
		return riskAssessments;
	}

	public void setRiskAssessments(List<RiskAssessment> riskAssessments) {
		this.riskAssessments = riskAssessments;
	}

	    
	
	
	

}
