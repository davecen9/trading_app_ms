package com.davecen9.bankapi.pojos;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class Bank {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bank_id")
	private int bankID;
	
	
	public int getBankID() {
		return bankID;
	}


	public void setBankID(int bankID) {
		this.bankID = bankID;
	}


	public BankName getBankName() {
		return bankName;
	}


	public void setBankName(BankName bankName) {
		this.bankName = bankName;
	}


	public BranchNo getBranchNo() {
		return branchNo;
	}


	public void setBranchNo(BranchNo branchNo) {
		this.branchNo = branchNo;
	}


	public BranchAddress getBranchAddress() {
		return branchAddress;
	}


	public void setBranchAddress(BranchAddress branchAddress) {
		this.branchAddress = branchAddress;
	}


	public BranchPhoneNumber getBranchPhoneNumber() {
		return branchPhoneNumber;
	}


	public void setBranchPhoneNumber(BranchPhoneNumber branchPhoneNumber) {
		this.branchPhoneNumber = branchPhoneNumber;
	}


	@Column(name="bank_name")
	@Embedded
	private BankName bankName;
	
	
	@Column(name="branch_no")
	@Embedded
	private BranchNo branchNo;
	
	@Column(name="branch_address")
	@Embedded
	private BranchAddress branchAddress;
	
	
	@Column(name="branch_phone_number")
	@Embedded
	private BranchPhoneNumber branchPhoneNumber;
	
	
	

}
