package com.blindtech.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
