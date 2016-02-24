package com.mcs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mcs.entity.Login;
import com.mcs.entity.PatientDetails;
import com.mcs.hibernate.HibernateUtil;

public class PatientDetailsManager {

	SessionFactory factory;

	public void saveDescription(PatientDetails patientDetails) {
		
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.saveOrUpdate(patientDetails);
		
		tx.commit();
	}
	
	
	public List<PatientDetails> getDescription(String firstName, String surName){
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		List<PatientDetails> list = session.createQuery("from PatientDetails where firstName like :firstName and surName like :surName").setParameter("firstName", firstName).setParameter("surName", surName).list();
				
		tx.commit();
		return list;
		
	}
}
