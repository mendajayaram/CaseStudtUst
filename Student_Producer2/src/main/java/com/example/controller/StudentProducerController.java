package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;



@RestController
@XmlRootElement
public class StudentProducerController 
{

@GetMapping("/student")
	public Student show_employee(HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println("this is student method");
		//String name=req.getParameter("name");
		//String address=req.getParameter("address");
		//String school=req.getParameter("school");
		Student std=new Student();
		std.setStudent_id(105);
		std.setStudent_name("sharanya");
		std.setAddress("wgl");
		
		/*std.setSchool_name("sssm");
		std.setStudent_name(name);
 	    std.setAddress(address);
		std.setSchool_name(school);*/
		System.out.println(std+",,,,,,,,in student");
		return std;
	}
	
	/*@GetMapping("/student")
	public String  show_employee(HttpServletRequest req,HttpServletResponse res,HttpSession session,Model model)
	{
		System.out.println("this is student method");
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String school=req.getParameter("school");
		Student std=new Student();
		std.setStudent_id(105);

		std.setStudent_name(name);
		std.setAddress(address);
		std.setSchool_name(school);
		System.out.println(std+",,,,,,,,in student");
		
//		 model.addAttribute("name", name);
//	        model.addAttribute("address", address);
//	        model.addAttribute("school",school);
		
		//session.setAttribute("std",std);
		session.setAttribute("test","test");
		session.setAttribute("name",name);
		session.setAttribute("address",address);
		session.setAttribute("school",school);
		
		
	    return "response";
		// return new ModelAndView("response");
	}*/
	
	/*@RequestMapping(value="/", method = RequestMethod.GET)
	public String login_page()
	{
		System.out.println("we are redirecting to login page....");
		return "index";
	}*/
}
