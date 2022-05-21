package com.jbk.branch.dao;

import java.util.List;

import javax.transaction.Transaction;
import javax.websocket.Session;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.branch.entity.Branch;

@Repository
public class BranchDaoImpl implements BranchDao{
	
   @Autowired
   public SessionFactory sf;
	@Override
	public Branch saveBranch(Branch branch) {

   org.hibernate.Session session=sf.openSession();
   org.hibernate.Transaction transaction=session.beginTransaction();
       
   try {
			session.save(branch);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
          finally {
			session.close();
		}
		return branch;
	}
	@Override
	public Branch getBranchById(Integer branchId) {
	           org.hibernate.Session session=sf.openSession();
	           Branch br=null;
	           try {
				 br=session.get(Branch.class, branchId);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	           finally {
				session.close();
			}
		return br;
	}
	@Override
	public List<Branch> getAllBranch() {
		org.hibernate.Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Branch.class);
		List<Branch> list=criteria.list();
		  
		return list;
	}

}
