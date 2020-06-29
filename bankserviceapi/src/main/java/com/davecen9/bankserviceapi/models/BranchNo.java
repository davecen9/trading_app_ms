package com.davecen9.bankserviceapi.models;

import javax.persistence.Embeddable;

@Embeddable
public class BranchNo {
	private long branchNo;

	public long getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(long branchNo) {
		this.branchNo = branchNo;
	}
}
