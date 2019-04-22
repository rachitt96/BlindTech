package com.blindtech.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blindtech.entity.Register;

@Component
public class RegisterDao 
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void addRegisterEntry(Register regObject)
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(regObject);
	}
}
