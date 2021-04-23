package com.cg.entities;

import java.util.List;

public class AdminUser {
	private String adminUsername;
	private String password;
	private List<Integer> caseNumber; // bus operator's updation or bus cancelation request
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Integer> getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(List<Integer> caseNumber) {
		this.caseNumber = caseNumber;
	}

	
}
