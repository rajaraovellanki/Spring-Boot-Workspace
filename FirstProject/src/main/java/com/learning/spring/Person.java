package com.learning.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person
{
	private int id;
	private String name;
	private int age;	
	@Autowired
	@Qualifier("lapt1")
	private Laptop laptop;
	
	public void showLaptop()
	{
		System.out.println("lid = "+laptop.getLid()+", brand = "+laptop.getBrand());
	}
	
	public Person()
	{
		System.out.println("Person object Created");
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
