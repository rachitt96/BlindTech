package com.blindtech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Persons")
public class Register 
{
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String gender;
	private String hobby;
	private String MobileNumber;
	@Id
	private int PersonID;
	
	public Register(String firstName, String middleName, String lastName, String gender, String hobby, String mobileNumber) 
	{
		super();
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		this.gender = gender;
		this.hobby = hobby;
		MobileNumber = mobileNumber;
	}
	
	public Register()
	{
		
	}

	public String getFirstName() 
	{
		return FirstName;
	}
	
	public void setFirstName(String firstName) 
	{
		FirstName = firstName;
	}
	
	public String getMiddleName() 
	{
		return MiddleName;
	}
	
	public void setMiddleName(String middleName) 
	{
		MiddleName = middleName;
	}
	
	public String getLastName() 
	{
		return LastName;
	}
	
	public void setLastName(String lastName) 
	{
		LastName = lastName;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
	public String getHobby() 
	{
		return hobby;
	}
	
	public void setHobby(String hobby) 
	{
		this.hobby = hobby;
	}
	
	public String getMobileNumber() 
	{
		return MobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) 
	{
		MobileNumber = mobileNumber;
	}

}
