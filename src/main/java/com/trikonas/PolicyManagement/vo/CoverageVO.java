package com.trikonas.PolicyManagement.vo;

import java.math.BigDecimal;


public class CoverageVO {

	private BigDecimal limit;
	private String type;
	
	
	
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

}
