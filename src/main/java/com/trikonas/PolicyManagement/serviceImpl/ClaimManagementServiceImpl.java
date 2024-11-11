package com.trikonas.PolicyManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trikonas.PolicyManagement.model.Claim;
import com.trikonas.PolicyManagement.repo.ClaimRepo;
import com.trikonas.PolicyManagement.service.ClaimManagementService;
import com.trikonas.PolicyManagement.vo.ClaimVO;

@Service
public class ClaimManagementServiceImpl implements ClaimManagementService{
	
	@Autowired
	ClaimRepo claimRepo;

	@Override
	public ClaimVO getClaimsbyID(Integer id) {
		
		Claim claim = claimRepo.findById(id).get();
		//ClaimVO object
		
		ClaimVO claimVO = new ClaimVO();
		claimVO.setClaimNumber(claim.getClaimNumber());
		claimVO.setClaimDate(claim.getClaimDate());
		claimVO.setClaimAmount(claim.getClaimAmount());
		claimVO.setClaimStatus(claim.getClaimStatus());
		claimVO.setNotes(claim.getNotes());
		claimVO.setPolicyNumber(claim.getPolicy().getPolicyNum());
		
		return claimVO;
	}
	

}
