package com.jbk.branch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.jbk.branch.entity.Branch;
import com.jbk.branch.service.BranchService;

@RestController
@RequestMapping(value = "/branch")
public class BranchController {

	@Autowired
	private BranchService service;

	@PostMapping(value = "/saveBranch")
	public ResponseEntity<Branch> saveBranch(@RequestBody Branch branch) {

		Branch br = service.saveBranch(branch);
		if (br != null) {
			return new ResponseEntity<Branch>(br, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Branch>(br, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping(value = "/getBranchById/{branchId}")

	public ResponseEntity<Branch> getBranchById(@PathVariable Integer branchId) {
		Branch br = service.getBranchById(branchId);
		if (br != null) {
			return new ResponseEntity<Branch>(br, HttpStatus.OK);
		} else {
			return new ResponseEntity<Branch>(br, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/getAllBranch")
	public ResponseEntity<List<Branch>> getAllBranch() {
		List<Branch> list = service.getAllBranch();
		if (!list.isEmpty()) {
          return new ResponseEntity<List<Branch>>(list,HttpStatus.OK);
       }else {
    	   return new ResponseEntity<List<Branch>> (list,HttpStatus.NOT_FOUND);
       }
		
		}}