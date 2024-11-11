package com.trikonas.PolicyManagement.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="agency")
public class Agency {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Agency_id")
	private Integer id;
	
	@Column(name="Agency_name")
	private String name;
	
	@Column(name="Phone_num")
	private String phoneNum;
	
	@Column(name="Address")
	private String address;
	
	@OneToMany(mappedBy = "agency") 
    private List<Agent> agents;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Agent> getAgents() {
		return agents;
	}

	public void setAgents(List<Agent> agents) {
		this.agents = agents;
	}
	
	
}
