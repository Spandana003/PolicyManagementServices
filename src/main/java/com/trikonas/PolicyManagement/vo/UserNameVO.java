package com.trikonas.PolicyManagement.vo;

import java.util.ArrayList;
import java.util.List;

public class UserNameVO {
	
	private String firstName;
	private String lastName;
	private List<String> strClaims = new ArrayList<String>();
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
	public List<String> getStrClaims() {
		return strClaims;
	}
	public void setStrClaims(List<String> strClaims) {
		this.strClaims = strClaims;
	}
	public List<ClaimVO> getClaims() {
		return claims;
	}
	public void setClaims(List<ClaimVO> claims) {
		this.claims = claims;
	}
	
	
	

}
