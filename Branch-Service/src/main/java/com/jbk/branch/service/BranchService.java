package com.jbk.branch.service;

import java.util.List;

import com.jbk.branch.entity.Branch;

public interface BranchService {
	
	public Branch saveBranch(Branch branch);
	public Branch  getBranchById(Integer branchId);
	public List<Branch> getAllBranch();

}
