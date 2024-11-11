package com.trikonas.PolicyManagement.vo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;



public class UserVO {
	
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNo;
	private String address;
	private Date dateOfBirth;
	private int policyCount;
	private List<ClaimVO> claims = new ArrayList<ClaimVO>();
	private List<String> strClaims = new ArrayList<String>(); 
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getPolicyCount() {
		return policyCount;
	}
	public void setPolicyCount(int policyCount) {
		this.policyCount = policyCount;
	}
	public List<ClaimVO> getClaims() {
		return claims;
	}
	public void setClaims(List<ClaimVO> claims) {
		this.claims = claims;
	}
	public List<String> getStrClaims() {
		return strClaims;
	}
	public void setStrClaims(List<String> strClaims) {
		this.strClaims = strClaims;
	}
	
	
	
	
	
	
}
