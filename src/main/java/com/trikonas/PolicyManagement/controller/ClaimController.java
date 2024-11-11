package com.trikonas.PolicyManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trikonas.PolicyManagement.service.ClaimManagementService;
import com.trikonas.PolicyManagement.vo.ClaimVO;

@RestController
@RequestMapping("/policymanagement/claim")
public class ClaimController {
	
	@Autowired
	ClaimManagementService claimManagementService;
	
	@RequestMapping("/{id}")
	public ClaimVO getClaimDetails(@PathVariable Integer id) {
		return claimManagementService.getClaimsbyID(id);
	}

}
