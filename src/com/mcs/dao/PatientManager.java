package com.mcs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mcs.hibernate.HibernateUtil;

public class PatientManager {

	private static SessionFactory factory;

	public void createFactory() {
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		tx.commit();
	}
}
