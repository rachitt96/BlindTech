package com.test.java.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testing_table")
public class Registration 
{
	private String full_name;
	private String email;
	@Id
	private int id;
	
	public Registration(String name, String email) 
	{
		super();
		this.full_name = name;
		this.email = email;
	}

	public String getName() 
	{
		return full_name;
	}
	
	public void setName(String name) 
	{
		this.full_name = name;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	
}
