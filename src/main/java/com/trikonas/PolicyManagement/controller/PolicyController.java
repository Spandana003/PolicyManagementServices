package com.trikonas.PolicyManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trikonas.PolicyManagement.service.PolicyManagementService;
import com.trikonas.PolicyManagement.vo.CoverageVO;
import com.trikonas.PolicyManagement.vo.PolicyVO;


@RestController
@RequestMapping("policymanagement/policy")
public class PolicyController {
	
	@Autowired
	PolicyManagementService policyManagementService;
	
	@RequestMapping("/{id}")
	public PolicyVO getPolicybyID(@PathVariable Integer id) {
		return policyManagementService.getPolicyDetails(id);
	}
	
	 @GetMapping("/{id}/coverages")
	    public List<CoverageVO> getCoverageDetails(@PathVariable Integer id) {
	        return policyManagementService.getCoverageDetails(id);

}
}