package com.test.java;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.java.dao.RegistrationDao;
import com.test.java.entity.Registration;

@Controller
public class AddController 
{
	@Autowired
	RegistrationDao rdao;
	
	Registration registrationObject;
	
	@RequestMapping("/add1")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res)
	{
		int t1 = Integer.parseInt(req.getParameter("t1"));
		int t2 = Integer.parseInt(req.getParameter("t2"));
		int total = t1 + t2;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayResult.jsp");
		mv.addObject("result", total);
		
		return mv;
	}
	
	@RequestMapping("/registration")
	public void regi(@RequestParam(name = "name") String nameString, @RequestParam(name = "email") String emailString)
	{
		System.out.println(nameString);
		System.out.println(emailString);
		
		registrationObject = new Registration(nameString, emailString);
		rdao.addData(registrationObject);
	}
}
