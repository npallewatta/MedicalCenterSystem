package com.mcs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mcs.entity.Drug;
import com.mcs.hibernate.HibernateUtil;

public class BillManager {
	
	SessionFactory factory;
	
	public List<Drug> getDrugList(){
		
		List<Drug> drugList;

		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		drugList = session.createQuery("from Drug").list();
		
		tx.commit();
		
		return drugList;
	}

}
