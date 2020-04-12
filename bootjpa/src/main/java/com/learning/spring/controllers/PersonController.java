package com.learning.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.learning.spring.Person;
import com.learning.spring.repos.PersonRepository;

@Controller
public class PersonController
{
	@Autowired
	PersonRepository pr;
	
	@RequestMapping("/home")
	public ModelAndView home()
	{
		return new ModelAndView("home.jsp");
	}	
	
	@RequestMapping("/insertPerson")
	public ModelAndView insertPerson(Person person)
	{
		pr.save(person);
		return new ModelAndView("home.jsp");
	}
	
	@RequestMapping("/getPerson")
	public ModelAndView getPerson(@RequestParam int id)
	{
		return new ModelAndView("personDetails.jsp").addObject("person",pr.findById(id).orElse(new Person()));
	}
	
	@RequestMapping("/putPerson")
	public ModelAndView putPerson(Person person)
	{
		pr.save(person);
		return new ModelAndView("home.jsp");
	}
	
	@RequestMapping("/deletePerson")
	public ModelAndView deletePerson(@RequestParam int id)
	{
		pr.deleteById(id);
		return new ModelAndView("home.jsp");
	}
	
	@RequestMapping("/persons")
	@ResponseBody
	public String getAllPersons()
	{
		return pr.findAll().toString();
	}
}
