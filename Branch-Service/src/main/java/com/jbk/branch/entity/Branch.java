package com.jbk.branch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch")
public class Branch {

	@Id
	
	@Column(name="branch_id")
	
private	Integer branchId;
	@Column(name="branch_name")
private	String branchName;
	@Column(name="branch_code")
	private Integer branchCode;
	
public	Branch(){
		
	}

public Branch(Integer branchId, String branchName, Integer branchCode) {
	super();
	this.branchId = branchId;
	this.branchName = branchName;
	this.branchCode = branchCode;
}

public Integer getBranchId() {
	return branchId;
}

public void setBranchId(Integer branchId) {
	this.branchId = branchId;
}

public String getBranchName() {
	return branchName;
}

public void setBranchName(String branchName) {
	this.branchName = branchName;
}

public Integer getBranchCode() {
	return branchCode;
}

public void setBranchCode(Integer branchCode) {
	this.branchCode = branchCode;
}

@Override
public String toString() {
	return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchCode=" + branchCode + "]";
}



}
