package com.trikonas.PolicyManagement.vo;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.trikonas.PolicyManagement.model.Coverage;
import com.trikonas.PolicyManagement.model.Policy;


public class PolicyVO {

	
	private Integer policyNum;
	private Date startDate;
	private Date endDate;
	private BigDecimal premiumAmount;
	private BigDecimal coverageAmount;
    private Policy.PolicyType policyType;
    private String userName;
    private int numberOfClaims;
    private List<Coverage> coverages = new ArrayList<Coverage>();;
   
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
	
	public Policy.PolicyType getPolicyType() {
	    return policyType;
	}

	public void setPolicyType(Policy.PolicyType policyType) {
	    this.policyType = policyType;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getNumberOfClaims() {
		return numberOfClaims;
	}
	public void setNumberOfClaims(int numberOfClaims) {
		this.numberOfClaims = numberOfClaims;
	}
	
	    
}
