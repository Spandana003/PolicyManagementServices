package com.trikonas.PolicyManagement.vo;

import java.math.BigDecimal;
import java.sql.Date;

import com.trikonas.PolicyManagement.model.Claim;


public class ClaimVO {
	private Integer claimNumber;
	private Date claimDate;
	private BigDecimal claimAmount;
	private Claim.ClaimStatus claimStatus;
	private String notes;
	private Integer policyNumber;
	
	
	
	public Integer getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(Integer claimNumber) {
		this.claimNumber = claimNumber;
	}
	public Date getClaimDate() {
		return claimDate;
	}
	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
	}
	public BigDecimal getClaimAmount() {
		return claimAmount;
	}
	public void setClaimAmount(BigDecimal claimAmount) {
		this.claimAmount = claimAmount;
	}
	public Claim.ClaimStatus getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(Claim.ClaimStatus claimStatus) {
		this.claimStatus = claimStatus;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Integer getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	
	
	
	
}
