package com.blindtech.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blindtech.dao.RegisterDao;
import com.blindtech.entity.Register;

@Controller
public class RegisterController 
{
	@Autowired
	RegisterDao registerDao;
	
	Register registerObject;
	
	@RequestMapping("/registration")
	public String regController(HttpServletRequest request, HttpServletResponse response)
	{
		
		String fName = request.getParameter("fn");
		String mName = request.getParameter("mn");
		String lName = request.getParameter("ln");
		String gender = request.getParameter("gender");
		String mNumber = request.getParameter("mobile");
		String hobbies[] = request.getParameterValues("hobby");
		
		String hobbiesString="";
		
		for(int i = 0; i < hobbies.length;i ++)
		{
			hobbiesString = hobbiesString + hobbies[i];
		}
		
		registerObject = new Register(fName, mName, lName, gender, hobbiesString, mNumber);
		registerDao.addRegisterEntry(registerObject);
		
		return("registration_form");
	}
	
	@RequestMapping(value = "/registrationUsingJSON/", method = RequestMethod.POST)
	public void regJsonController(@RequestBody Register person)
	{
		System.out.println("In first");
		
		registerDao.addRegisterEntry(person);
	}
	
	@RequestMapping(value = "/registrationUsingJSON")
	public ResponseEntity<?> convertToJSON(HttpServletRequest request, HttpServletResponse response) 
	{
		System.out.println("In Second");
		
		String fName = request.getParameter("fn");
		String mName = request.getParameter("mn");
		String lName = request.getParameter("ln");
		String gender = request.getParameter("gender");
		String mNumber = request.getParameter("mobile");
		String hobbies[] = request.getParameterValues("hobby");
		
		String hobbiesString="";
		
		for(int i = 0; i < hobbies.length;i ++)
		{
			hobbiesString = hobbiesString + hobbies[i];
		}
		
		if(fName == null || mName == null || lName == null || gender == null || mNumber == null || hobbiesString == null)
		{
			return new ResponseEntity<String>("Field is Required", HttpStatus.BAD_REQUEST);
		}
		
		
		Register person = new Register();
		person.setFirstName(fName);
		person.setMiddleName(mName);
		person.setLastName(lName);
		person.setGender(gender);
		person.setHobby(hobbiesString);
		person.setMobileNumber(mNumber);

	    return new ResponseEntity<Register>(person, HttpStatus.OK);
	}
}
