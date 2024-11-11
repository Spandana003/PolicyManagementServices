package com.trikonas.PolicyManagement.service;

import java.util.List;

import com.trikonas.PolicyManagement.vo.CoverageVO;
import com.trikonas.PolicyManagement.vo.PolicyVO;

public interface PolicyManagementService {
	
	public PolicyVO getPolicyDetails(Integer id);
	public List<CoverageVO> getCoverageDetails(Integer id);

}
