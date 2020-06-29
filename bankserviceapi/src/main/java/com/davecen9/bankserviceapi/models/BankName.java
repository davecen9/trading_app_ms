package com.davecen9.bankserviceapi.models;

import javax.persistence.Embeddable;

@Embeddable
public class BankName {
	private String bankName;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}
