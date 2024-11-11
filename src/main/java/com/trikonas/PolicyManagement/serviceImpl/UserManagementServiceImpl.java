package com.trikonas.PolicyManagement.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trikonas.PolicyManagement.model.Claim;
import com.trikonas.PolicyManagement.model.Policy;
import com.trikonas.PolicyManagement.model.User;
import com.trikonas.PolicyManagement.repo.UserRepo;
import com.trikonas.PolicyManagement.service.UserManagementService;
import com.trikonas.PolicyManagement.vo.ClaimVO;
import com.trikonas.PolicyManagement.vo.UserClaimVO;
import com.trikonas.PolicyManagement.vo.UserNameVO;
import com.trikonas.PolicyManagement.vo.UserVO;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public UserVO getUserDetails(Integer id) {
	
		//this line will get data from database
	    User userEntity = 	userRepo.findById(id).get();
	    
	    //map data from entity to VO
	    UserVO userVO = new UserVO();
	    userVO.setFirstName(userEntity.getFirstName());
	    userVO.setLastName(userEntity.getLastName());
	    userVO.setEmail(userEntity.getEmail());
	    userVO.setMobileNo(userEntity.getMobileNo());
	    userVO.setDateOfBirth(userEntity.getDateOfBirth());
	    userVO.setAddress(userEntity.getAddress());
	    userVO.setPolicyCount(userEntity.getPolicies().size());
	    return userVO;
	}

	@Override
	public UserNameVO getClaimStatus(Integer id) {
		 User userEntity = 	userRepo.findById(id).get();
		 UserNameVO userNameVO = new UserNameVO();
		 
		 userNameVO.setFirstName(userEntity.getFirstName());
		 userNameVO.setLastName(userEntity.getLastName());
		 // get policies from user
		    List<Policy> userPolicies =  userEntity.getPolicies();
		    // take one policy at a time from user's policies
		    for(Policy p : userPolicies) {
		    	String str = "";
		    	
		    	List<Claim> policyClaims =   p.getClaims();
		    	
		    	// take one claim at a time from policy list
		    	for(Claim clm : policyClaims) {
		    		
		    		str = clm.getClaimNumber() + " : " + clm.getClaimStatus().name();
		    		userNameVO.getStrClaims().add(str);
		    		
		    		
		    	}
		    	
		    }
		    
		    
		    return userNameVO;
		 
	}

	@Override
	public UserClaimVO getOnlyClaims(Integer id) {
		
		User user = userRepo.findById(id).get();
		UserClaimVO userClaimVO = new UserClaimVO();
		userClaimVO.setFirstName(user.getFirstName());
		userClaimVO.setLastName(user.getLastName());
		
		
		
		List<Policy> policies = user.getPolicies();
		
		for(Policy policy : policies) {
			
			
			
			List<Claim> claims = policy.getClaims();
			for(Claim claim : claims) {
			
				
				ClaimVO claimVO = new ClaimVO();
				claimVO.setClaimNumber(claim.getClaimNumber());
				claimVO.setClaimDate(claim.getClaimDate());
				claimVO.setClaimAmount(claim.getClaimAmount());
				claimVO.setClaimStatus(claim.getClaimStatus());
				claimVO.setNotes(claim.getNotes());
				/*
				 * if(userClaimVO.getClaims() == null) { userClaimVO.setClaims(new
				 * ArrayList<ClaimVO>()); }
				 */
				 userClaimVO.getClaims().add(claimVO);	
				
			}
		}
	
	return userClaimVO ;
}
	
	
	

	@Override
	public UserVO getWholeDetails(Integer id) {
		
		 User userEntity = 	userRepo.findById(id).get();
		    
		    //map data from entity to VO
		    UserVO userVO = new UserVO();
		    userVO.setFirstName(userEntity.getFirstName());
		    userVO.setLastName(userEntity.getLastName());
		    userVO.setEmail(userEntity.getEmail());
		    userVO.setMobileNo(userEntity.getMobileNo());
		    userVO.setDateOfBirth(userEntity.getDateOfBirth());
		    userVO.setAddress(userEntity.getAddress());
		    userVO.setPolicyCount(userEntity.getPolicies().size());
		    
		    // get policies from user
		    List<Policy> userPolicies =  userEntity.getPolicies();
		    // take one policy at a time from user's policies
		    for(Policy p : userPolicies) {
		    	String strClaimNumberandStatus = "";
		    	List<Claim> policyClaims =   p.getClaims();
		    	
		    	// take one claim at a time from policy list
		    	for(Claim clm : policyClaims) {
		    		
		    		
		    		ClaimVO clmVO = new ClaimVO();
			    	
		    		strClaimNumberandStatus = clm.getClaimNumber() + " : " + clm.getClaimStatus().name();
		    		userVO.getStrClaims().add(strClaimNumberandStatus);
		    		
		    		clmVO.setClaimNumber(clm.getClaimNumber());
		    		clmVO.setClaimAmount(clm.getClaimAmount());
		    		clmVO.setClaimDate(clm.getClaimDate());
		    		clmVO.setClaimStatus(clm.getClaimStatus());
		    		clmVO.setNotes(clm.getNotes());
		    		
		    		userVO.getClaims().add(clmVO);
		    		
		    	}
		    	
		    }
		
		return userVO;
	}
}
