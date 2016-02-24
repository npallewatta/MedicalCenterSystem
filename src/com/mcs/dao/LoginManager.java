package com.mcs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mcs.entity.Login;
import com.mcs.hibernate.HibernateUtil;

public class LoginManager {
	
	SessionFactory factory;
	
	public Login validateLogin(Login login){
		HibernateUtil hibernateUtil = new HibernateUtil();
		factory = hibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		List<Login> result = session.createQuery("from Login where userName=:userName and password=:password")
				.setParameter("userName", login.getUserName())
				.setParameter("password", login.getPassword())
				.list();
		tx.commit();
		if(result.size()>0){
			return result.get(0);
		}
		else
			return null;
	}
	
}
