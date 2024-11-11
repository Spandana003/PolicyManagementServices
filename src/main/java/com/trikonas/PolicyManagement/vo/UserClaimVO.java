package com.trikonas.PolicyManagement.vo;

import java.util.ArrayList;
import java.util.List;

public class UserClaimVO {

	private String firstName;
	private String lastName;
	private List<ClaimVO> claims = new ArrayList<ClaimVO>();
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
	public List<ClaimVO> getClaims() {
		return claims;
	}
	public void setClaims(List<ClaimVO> claims) {
		this.claims = claims;
	}
	
	
}
