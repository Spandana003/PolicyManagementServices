package com.trikonas.PolicyManagement.service;


import com.trikonas.PolicyManagement.vo.UserClaimVO;
import com.trikonas.PolicyManagement.vo.UserNameVO;
import com.trikonas.PolicyManagement.vo.UserVO;

public interface UserManagementService {
		
	public UserVO getUserDetails(Integer id) ;
	public UserNameVO getClaimStatus(Integer id);
	
	public UserClaimVO getOnlyClaims(Integer id);
	public UserVO getWholeDetails(Integer id) ;
	}
