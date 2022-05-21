package com.jbk.branch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.branch.dao.BranchDao;
import com.jbk.branch.entity.Branch;

@Service
public class BranchServiceImpl implements BranchService{

	@Autowired
	private BranchDao dao;
	
	@Override
	public Branch saveBranch(Branch branch) {
	          Branch br= dao.saveBranch(branch);
		return br;
	}

	@Override
	public Branch getBranchById(Integer branchId) {
		Branch br=dao.getBranchById(branchId);
		
		return br;
	}

	@Override
	public List<Branch> getAllBranch() {
		List<Branch> list=dao.getAllBranch();
		return list;
	}

}
