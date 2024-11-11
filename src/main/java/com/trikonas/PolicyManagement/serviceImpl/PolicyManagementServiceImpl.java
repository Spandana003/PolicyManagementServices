package com.trikonas.PolicyManagement.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trikonas.PolicyManagement.model.Coverage;
import com.trikonas.PolicyManagement.model.Policy;

import com.trikonas.PolicyManagement.repo.PolicyRepo;
import com.trikonas.PolicyManagement.service.PolicyManagementService;
import com.trikonas.PolicyManagement.vo.CoverageVO;
import com.trikonas.PolicyManagement.vo.PolicyVO;

@Service
public class PolicyManagementServiceImpl implements PolicyManagementService{
	
	@Autowired
	PolicyRepo policyRepo;

	@Override
	public PolicyVO getPolicyDetails(Integer id) {
		Policy policy = policyRepo.findById(id).get();
		//object of PolicyVO
		PolicyVO policyVO = new PolicyVO();
		policyVO.setPolicyNum(policy.getPolicyNum());
		policyVO.setStartDate(policy.getStartDate());
		policyVO.setEndDate(policy.getEndDate());
		policyVO.setPolicyType(policy.getPolicyType()); 
		policyVO.setPremiumAmount(policy.getPremiumAmount());
		policyVO.setCoverageAmount(policy.getCoverageAmount());
		policyVO.setUserName(policy.getUser().getFirstName() +" "+ policy.getUser().getLastName());
		policyVO.setNumberOfClaims(policy.getClaims().size());
		
		
		return policyVO;
	}

	@Override
	public List<CoverageVO> getCoverageDetails(Integer id) {
		 Policy policy = policyRepo.findById(id).get();
		
		 List<CoverageVO> coverageVOs = new ArrayList<CoverageVO>();
		    
		    //for loop
			/*
			 * for (Coverage coverage : policy.getCoverages()) { CoverageVO coverageVO = new
			 * CoverageVO(); coverageVO.setLimit(coverage.getLimit());
			 * coverageVO.setType(coverage.getType()); coverageVOs.add(coverageVO); }
			 */
		    
		    //while loop
			/*
			 * Iterator<Coverage> coverageIterator = policy.getCoverages().iterator();
			 * while(coverageIterator.hasNext()) {
			 * 
			 * Coverage coverage = coverageIterator.next(); CoverageVO coverageVO = new
			 * CoverageVO(); coverageVO.setLimit(coverage.getLimit());
			 * coverageVO.setType(coverage.getType()); coverageVOs.add(coverageVO);
			 * 
			 * }
			 */  
		
			// using streams 
			 coverageVOs = policy.getCoverages().stream() .map( coverage
			  -> { CoverageVO coverageVO = new CoverageVO();
			  coverageVO.setLimit(coverage.getLimit());
			  coverageVO.setType(coverage.getType()); return coverageVO; }
			  ).collect(Collectors.toList());
			
		    
		    return coverageVOs; 
		}

}
