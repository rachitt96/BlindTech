package com.test.java.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.java.entity.Registration;

@Component
public class RegistrationDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addData(Registration reg)
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(reg);
	}
}