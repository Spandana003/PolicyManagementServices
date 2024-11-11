package com.trikonas.PolicyManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.trikonas.PolicyManagement.service.UserManagementService;
import com.trikonas.PolicyManagement.vo.UserClaimVO;
import com.trikonas.PolicyManagement.vo.UserNameVO;
import com.trikonas.PolicyManagement.vo.UserVO;

@RestController
@RequestMapping("policymanagement/user")
public class UserController {
	
	@Autowired
	UserManagementService customerManagementService;
	
	
	 @GetMapping("/{id}")
	    public UserVO getUserById(@PathVariable Integer id) {
	        return customerManagementService.getUserDetails(id);
	    }
	 
	 @GetMapping("/status/{id}")
	    public UserNameVO getStatusById(@PathVariable Integer id) {
	        return customerManagementService.getClaimStatus(id);
	    }
	 
	 @GetMapping("/claims/{id}")
	    public UserClaimVO getTheClaims(@PathVariable Integer id) {
	        return customerManagementService.getOnlyClaims(id);
	    }
	 
	 @GetMapping("/details/{id}")
	    public UserVO getDetailsById(@PathVariable Integer id) {
	        return customerManagementService.getWholeDetails(id);
	    }
}


