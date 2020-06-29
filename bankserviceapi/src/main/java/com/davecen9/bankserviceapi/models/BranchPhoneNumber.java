package com.davecen9.bankserviceapi.models;

import javax.persistence.Embeddable;

@Embeddable
public class BranchPhoneNumber {
	private String branchPhoneNumber;

	public String getBranchPhoneNumber() {
		return branchPhoneNumber;
	}

	public void setBranchPhoneNumber(String branchPhoneNumber) {
		this.branchPhoneNumber = branchPhoneNumber;
	}
	
}
